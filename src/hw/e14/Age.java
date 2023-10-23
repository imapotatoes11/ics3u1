package hw.e14;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        // instantiate objects
        Scanner sc = new Scanner(System.in);
        final int age = 15;
        int guess = 0;

        // the loop
        while (guess != age) {
            // ask user for age
            System.out.printf("Guess my age: ");
            guess = sc.nextInt();

            // if guess is correct, tell the user
            // if guess is incorrect, tell the user
            if (guess == age) {
                System.out.println("Correct!");
            } else {
                System.out.println("That is not my age, guess again.");
            }
        }
    }
}
