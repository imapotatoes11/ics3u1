package hw.e11;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        // initialize scanner class
        Scanner sc = new Scanner(System.in);

        // Define base salary
        final int baseSalary = 1000;

        // ask user for sales
        System.out.print("How many sales?: ");
        int sales = sc.nextInt();

        // Calculate salary and return to user
        if (sales > 10) {
            double finalSalary = baseSalary * (1 + ((double) sales / 100));
            System.out.println("Your salary this month is $" + finalSalary);
        } else {
            System.out.println("Your salary this month is $" + baseSalary);
        }
    }
}
