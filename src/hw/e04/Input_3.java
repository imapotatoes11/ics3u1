package hw.e04;

import java.util.Scanner;

public class Input_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("What's your name?  ");
        String name = sc.nextLine();
        System.out.printf("How old are you?  ");
        int age = sc.nextInt();
        System.out.printf("So you are %s and you are %d", name, age);
    }
}
