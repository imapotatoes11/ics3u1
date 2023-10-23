package hw.e14;

import java.rmi.UnexpectedException;
import java.util.Scanner;

public class Count3 {
    public static void main(String[] args) throws UnexpectedException {
        // instantiate objects
        Scanner sc = new Scanner(System.in);
        long a, b;

        // ask user for numbers
        System.out.printf("Enter the a: ");
        a = sc.nextLong();
        System.out.printf("Enter the b: ");
        b = sc.nextLong();

        // check if a is less than b
        if (a > b) {
            throw new UnexpectedException(
                    "a is larger than b.\na cannot be larger than b"
            );
        }

        // the loop
        while (a <= b) {
            System.out.println(a);
            a++;
        }
    }
}
