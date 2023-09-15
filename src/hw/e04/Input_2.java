package hw.e04;

import java.util.Scanner;

public class Input_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("What's your name?  ");
        String name = sc.nextLine();
        System.out.printf("Hello %s", name);
    }
}
