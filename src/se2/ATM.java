/*
 * Copyright 2023 Kevin Wang, Max Chu, Aryan Dhankhar
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the license at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the license is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * license for the specific language governing permissions and limitations under
 * the license.
 * */
/*
 * Dec. 15, 2023
 * The program
 * */
package se2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import se2.Line.*;

public class ATM {
    public static final String CSV_DIRECTORY = "src/se2/data.csv";
    /*
    |--------------------------------------------------------|
    | boolean validateLogin(int userID, int pin)             |
    |--------------------------------------------------------|
    | int userID: this parameter holds the inputted ID the   |
    |             user entered within the main method        |
    |                                                        |
    | int pin: this parameter holds the inputted PIN the     |
    |             user entered within the main method        |
    |--------------------------------------------------------|
    | return boolean: returns whether the login information  |
    |                 was correct or not                     |
    |--------------------------------------------------------|
    | Description: This method is used only to validate user |
    |              logins. If the userID is incorrect it will|
    |              print an error, if the pin is wrong it    |
    |              will also print and error. It returns true|
    |              only if all the information is correct.   |
    |--------------------------------------------------------|
    */
    public static boolean validateLogin(int userID, String pin) throws UserError {
        // create the return object
        boolean booleanValue = false;
        // the correct pin file
        String pinFile;
        // try to look for ID in data.csv
        try{
            // create a new CSVParser object
            CSVParser parser = new CSVParser(CSV_DIRECTORY);
            // grab pin from file
            pinFile = parser.getLine(userID).getPin();

            // verify the pin
            if (!Objects.equals(pin, pinFile)){
//                System.out.println("Error, inputted PIN was incorrect!");
                throw new UserError("Invalid PIN", UserError.ErrorType.INVALID_PIN);
            }
            else{
                booleanValue = true;
            }
        } catch(IOException e){
            // catch the IOException & assume the error was due to
            // an invalid ID
//            System.out.println("Error, couldn't find user ID!");
            throw new UserError("User ID not found", UserError.ErrorType.INVALID_ID);
        }
        // return the return object
        return booleanValue;
    }

    /*
    |--------------------------------------------------------|
    | void createUser()                                      |
    |--------------------------------------------------------|
    | Description: This method creates a new user, with user |
    |              ID, PIN, and first/last names entered by  |
    |              the user. The new user does not have any  |
    |              accounts open.                            |
    |--------------------------------------------------------|
    */
    public static void createUser() {
        // Initialize objects
        Scanner sc = new Scanner(System.in);
        String fname, lname;
        String userID = "", pin = "";
        boolean validInput = false;

        // ask for user ID, if invalid, keep asking
        do {
            System.out.println("Enter a 6 digit positive number as your user ID (must be unique): ");
            try {
                userID = sc.nextLine();

                // validate user ID
                if (Integer.parseInt(userID) <= 0) {
                    System.out.println("Please enter a positive number.");
                } else if (userID.length() != 6) {
                    System.out.println("Please enter a 6-digit number.");
                } else {
                    // check if the user ID is unique
                    boolean isUnique = true;
                    try {
                        CSVParser parser = new CSVParser(CSV_DIRECTORY);
                        for (Line line : parser.lines) {
                            if (line.getId().equals(userID)) {
                                System.out.println("User ID already exists.");
                            }
                        }
                    } catch (IOException ignored) {}
                    validInput = isUnique;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number.");
            }
        } while (!validInput);


        // ask for PIN, if invalid, keep asking
        validInput = false;
        do {
            System.out.println("Enter a 4 digit positive number as your pin: ");
            try {
                pin = sc.nextLine();
                // validate pin
                if (Integer.parseInt(pin) <= 0) {
                    System.out.println("Please enter a positive number.");
                } else if (pin.length() != 4) {
                    System.out.println("Please enter a 4-digit number.");
                } else {
                    validInput = true;
                }
            } catch (NumberFormatException e) {
                // catch the NumberFormatException & assume the error was due to
                // an invalid PIN
                System.out.println("Please enter a valid pin.");
            }
        } while (!validInput);


        // ask for first and last name
        System.out.println("Enter your first name: ");
        fname = sc.nextLine().toUpperCase();
        System.out.println("Enter your last name: ");
        lname = sc.nextLine().toUpperCase();

        // write data to file under a new entry
        // with all accounts closed by default
        try {
            CSVParser parser = new CSVParser(CSV_DIRECTORY);
            parser.addLine(new Line(userID,fname,lname,pin));
            System.out.println("The user was successfully created.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }

    /*
    |--------------------------------------------------------|
    | void createAccount(int userID)                         |
    |--------------------------------------------------------|
    | int userID: this parameter holds the inputted ID the   |
    |             user entered within the main method        |
    |--------------------------------------------------------|
    | Description: This method asks the user for what account|
    |              to open if they have no accounts.         |
    |              Prints an error message if user has both  |
    |              account types.                            |
    |              Automatically opens the other account if  |
    |              the user only has one.                    |
    |--------------------------------------------------------|
    */

    public static void createAccount(int userID) {
        try {
            // initialize objects
            CSVParser parser = new CSVParser(CSV_DIRECTORY);
            Scanner sc = new Scanner (System.in);
            boolean hasChecking = parser.getLine(userID).isChecking();
            boolean hasSavings = parser.getLine(userID).isSavings();
            boolean validInput = false; // TODO: bro this object is lit useless
            AccountType accountToOpen;

            // check which accounts the user has open
            if (hasChecking && hasSavings) {
                // can't do anything if the user has both accounts open
                System.out.println("You already have both accounts.");
            } else if (hasChecking) {
                // open a savings account and set balance to 0
                parser.getLine(userID).setSavings(true);
                parser.getLine(userID).setValueOfSavings(0);
                System.out.println("You have opened a savings account (your balance is $0).");

                // save changes to file
                parser.write();
            } else if (hasSavings) {
                // open a checking account and set balance to 0
                parser.getLine(userID).setChecking(true);
                parser.getLine(userID).setValueOfChecking(0);
                System.out.println("You have opened a checking account (your balance is $0).");

                // save changes to file
                parser.write();
            } else {
                do {
                    // ask user which account to open
                    System.out.print("Which kind of account do you want to open, c for checking, and s for savings: ");
                    accountToOpen = Objects.equals(sc.nextLine(), "c") ? AccountType.CHECKING : AccountType.SAVINGS;

                    if (accountToOpen == AccountType.CHECKING) {
                        // open a checking account
                        parser.getLine(userID).setChecking(true);
                        parser.getLine(userID).setValueOfChecking(0);
                        System.out.println("You have opened a checking account (your balance is $0).");
                        validInput = true;
                    } else {
                        // open a savings account
                        parser.getLine(userID).setSavings(true);
                        parser.getLine(userID).setValueOfSavings(0);
                        System.out.println("You have opened a savings account (your balance is $0).");
                        validInput = true;
                    }

                    // save changes to file
                    parser.write();
                } while (!validInput); //TODO: bro its always false just remove the do while
            }

        } catch (IOException e) {
            System.out.println("Error, problem reading file");
        }
    }

     /*
    |--------------------------------------------------------|
    | void createAccount(int userID)                         |
    |--------------------------------------------------------|
    | int userID: this parameter holds the inputted ID the   |
    |             user entered within the main method        |
    |--------------------------------------------------------|
    | Description: This method asks the user for what account|
    |              to close if they have both accounts.      |
    |              Prints an error message if user does not  |
    |              have any accounts.                        |
    |              Automatically closes the other account if |
    |              the user only has one.                    |
    |--------------------------------------------------------|
    */

    public static void closeAccount(int userID) {
        try {
            // initialize objects
            CSVParser parser = new CSVParser(CSV_DIRECTORY);
            Scanner sc = new Scanner (System.in);
            boolean hasChecking = parser.getLine(userID).isChecking();
            boolean hasSavings = parser.getLine(userID).isSavings();
            boolean validInput = false;
            String accountToOpen;

            // check which accounts the user has open
            if ((!hasChecking) && !hasSavings) {
                // can't do anything if the user has no accounts open
                System.out.println("You do not have any accounts open.");
            } else if (hasChecking) {
                // close checking account
                parser.getLine(userID).setChecking(false);
                parser.getLine(userID).setValueOfChecking(-1);
                System.out.println("You have closed your checking account.");

                // save changes to file
                parser.write();
            } else if (hasSavings) {
                // close savings account
                parser.getLine(userID).setSavings(false);
                parser.getLine(userID).setValueOfSavings(-1);
                System.out.println("You have closed your savings account.");

                // save changes to file
                parser.write();
            } else {
                do {
                    // ask which account to close
                    System.out.print("Do you want to close your checking or savings account?");
                    accountToOpen = sc.nextLine();

                    if (accountToOpen.equalsIgnoreCase("checking")) {
                        // close the checking account
                        parser.getLine(userID).setChecking(false);
                        parser.getLine(userID).setValueOfChecking(-1);
                        System.out.println("You have closed your checking account.");
                        validInput = true;
                    } else if (accountToOpen.equalsIgnoreCase("savings")) {
                        // close the savings account
                        parser.getLine(userID).setSavings(false);
                        parser.getLine(userID).setValueOfSavings(-1);
                        System.out.println("You have closed your savings account");
                        validInput = true;
                    } else {
                        System.out.println("Invalid input");
                    }

                    // save changes to file
                    parser.write();
                } while (validInput);
            }

        } catch (IOException e) {
            System.out.println("Error, problem reading file");
        }
    }

    /*
    |--------------------------------------------------------|
    | void deposit(int userID)                               |
    |--------------------------------------------------------|
    | int userID: this parameter holds the inputted ID the   |
    |             user entered within the main method        |
    |--------------------------------------------------------|
    | Description: Allows the user to deposit an amount into |
    |              any of their accounts and prints an error |
    |              if the user doesn't have one, or if the   |
    |              entered amount is too little.             |
    |--------------------------------------------------------|
    */
    public static void deposit(int userID){
        // initialize objects
        Scanner sc = new Scanner(System.in);
        int answered = 0; // flag to track if the user entered a valid input
        // initialize account type to prevent problems
        Line.AccountType accountType = Line.AccountType.CHECKING; // account type
        String newAccount; // whether the user wants to make a new account
        int accounts = 0; // number of accounts
        double depositAmount; // amount to deposit
        double originalBalance = 0; // original balance
        boolean accountChecking; // whether the user has a checking account
        boolean accountSavings; // whether the user has a savings account
        // This chuck of code checks the amount of accounts the user has and uses a try-catch in order to find the user ID
        try {
            CSVParser parser = new CSVParser(CSV_DIRECTORY);
            accountChecking = parser.getLine(userID).isChecking();
            accountSavings = parser.getLine(userID).isSavings();
            if (accountChecking){
                accounts++;
            }
            if (accountSavings){
                accounts++;
            }
            // TODO: continue here
            // switch case for what to do for each amount of accounts
            switch(accounts){
                // if they have no accounts print and error and ask for if they want to make one
                case 0:
                    System.out.println("Error, you have no accounts!");
                    while(answered == 0) {
                        // prompts user to ask if they want a new account
                        System.out.print("Do you want to make an account?(y/n) ");
                        newAccount = sc.nextLine();
                        // checks whether they do want a new account
                        if (newAccount.equals("y")) {
                            // Max, put in your createUser()
                            answered++;
                        }
                        else if (newAccount.equals("n")){
                            answered++;
                        }
                        else{
                            System.out.println("Please enter a valid input\n");
                        }
                    }
                    break;

                // if they have one account it checks which one
                case 1:
                    if (accountChecking){
                        accountType = Line.AccountType.CHECKING;
                        originalBalance = parser.getLine(userID).valueOfChecking();
                    }
                    else {
                        accountType = Line.AccountType.SAVINGS;
                        originalBalance = parser.getLine(userID).valueOfSavings();
                    }
                    break;

                // if they have 2 we want to know which account they want to deposit to
                case 2:
                    while(answered == 0) {
                        // prompts user which account they want to deposit too
                        System.out.print("Which account do you want to deposit to (C for checking, S for savings):");
                        accountType = Objects.equals(sc.nextLine(), "C") ? Line.AccountType.CHECKING : Line.AccountType.SAVINGS;
                        if (accountType == Line.AccountType.SAVINGS) {
                            originalBalance = parser.getLine(userID).valueOfSavings();
                            answered++;
                        } else {
                            originalBalance = parser.getLine(userID).valueOfChecking();
                            answered++;
                        }
                    }
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + accounts);
            }
            answered = 0;
            while(answered == 0) {
                // prompts the user for the amount they want to deposit
                System.out.print("Deposit: $");
                depositAmount = sc.nextDouble();
                if (depositAmount > 0.00) {
                    if (accountType == Line.AccountType.SAVINGS){
                        parser.getLine(userID).setValueOfSavings((originalBalance+depositAmount));
                        System.out.printf("Your savings accounts balance is now $%.2f", (originalBalance+depositAmount));
                    }
                    else if (accountType == Line.AccountType.CHECKING){
                        parser.getLine(userID).setValueOfChecking((originalBalance+depositAmount));
                        System.out.printf("Your checking accounts balance is now $%.2f", (originalBalance+depositAmount));
                    }
                    answered++;
                }
            }

        }catch(IOException e){
            System.out.println("Error, ID not found!");
        }
    }
    /*
  |--------------------------------------------------------|
  | void withdraw(int userID)                              |
  |--------------------------------------------------------|
  | int userID: this parameter holds the inputted ID the   |
  |             user entered within the main method        |
  |--------------------------------------------------------|
  | Description: Allows the user to withdraw an amount into|
  |              any of their accounts and prints an error |
  |              if the user doesn't have one, or it is too|
  |              much money to withdraw.                   |
  |--------------------------------------------------------|
  */
    public static void withdraw(int userID){
        // allows for a scanner
        Scanner sc = new Scanner(System.in);
        // variable for number of accounts, if the user wants an account, amount the user would like to withdraw, and the original balance, and which account the user has
        int answered = 0;
        String accountType = "";
        String newAccount;
        int accounts = 0;
        double withdrawAmount;
        double originalBalance = 0;
        boolean accountChecking;
        boolean accountSavings;
        // This chuck of code checks the amount of accounts the user has and uses a try-catch in order to find the user ID
        try {
            CSVParser parser = new CSVParser(CSV_DIRECTORY);
            accountChecking = parser.getLine(userID).isChecking();
            accountSavings = parser.getLine(userID).isSavings();
            if (accountChecking){
                accounts++;
            }
            if (accountSavings){
                accounts++;
            }
            // switch case for what to do for each amount of accounts
            switch(accounts){
                // if they have no accounts print and error and ask for if they want to make one
                case 0:
                    System.out.println("Error, you have no accounts!");
                    while(answered == 0) {
                        // prompts user to ask if they want a new account
                        System.out.print("Do you want to make an account?(y/n) ");
                        newAccount = sc.nextLine();
                        // checks whether they do want a new account
                        if (newAccount.equals("y")) {
                            // Max, put in your createUser()
                            answered++;
                        }
                        else if (newAccount.equals("n")){
                            answered++;
                        }
                        else{
                            System.out.println("Please enter a valid input\n");
                        }
                    }
                    break;

                // if they have one account it checks which one
                case 1:
                    if (accountChecking){
                        accountType = "Checking Account";
                        originalBalance = parser.getLine(userID).valueOfChecking();
                    }
                    else {
                        accountType = "Savings Account";
                        originalBalance = parser.getLine(userID).valueOfSavings();
                    }
                    break;

                // if they have 2 we want to know which account they want to deposit to
                case 2:
                    while(answered == 0) {
                        // prompts user which account they want to deposit too
                        System.out.print("Which account do you want to deposit to:");
                        accountType = sc.nextLine();
                        if (accountType.equalsIgnoreCase("savings")) {
                            originalBalance = parser.getLine(userID).valueOfSavings();
                            answered++;
                        } else if (accountType.equalsIgnoreCase("checking")) {
                            originalBalance = parser.getLine(userID).valueOfChecking();
                            answered++;
                        }
                    }
                    break;

            }
            answered = 0;
            while(answered == 0) {
                // prompts the user for the amount they want to deposit
                System.out.print("Deposit: $");
                withdrawAmount = sc.nextDouble();
                if (withdrawAmount > 0.00) {
                    if (accountType.equalsIgnoreCase("savings")){
                        if (originalBalance > withdrawAmount) {
                            parser.getLine(userID).setValueOfSavings((originalBalance - withdrawAmount));
                            System.out.printf("Your savings accounts balance is now $%.2f", (originalBalance - withdrawAmount));
                        }
                        else{
                            System.out.println("Error, cannot withdraw that much.");
                            answered--;
                        }
                    }
                    else if (accountType.equalsIgnoreCase("checking")){
                        if (originalBalance > withdrawAmount) {
                            parser.getLine(userID).setValueOfChecking((originalBalance - withdrawAmount));
                            System.out.printf("Your checking accounts balance is now $%.2f", (originalBalance - withdrawAmount));
                        }
                        else{
                            System.out.println("Error, cannot withdraw that much.");
                            answered--;
                        }
                    }
                    answered++;
                }
            }

        }catch(IOException e){
            System.out.println("Error, ID not found!");
        }
    }
}


class UserError extends Exception{
    public ErrorType errorType = null;
    public enum ErrorType {
        GENERIC,
        INVALID_ID,
        INVALID_PIN
    }
    public UserError(String errorMessage){
        super(errorMessage);

        this.errorType = ErrorType.GENERIC;
    }
    public UserError(String errorMessage, ErrorType errorType){
        super(UserError.getErrorMessage(errorType) + ": " + errorMessage);

        this.errorType = errorType;
    }
    private static String getErrorMessage(ErrorType errorType){
        switch(errorType){
            case GENERIC:
                return "An error occurred";
            case INVALID_ID:
                return "The specified user was not found";
            case INVALID_PIN:
                return "The specified PIN was invalid";
            default:
                return "Unknown error";
        }
    }
}