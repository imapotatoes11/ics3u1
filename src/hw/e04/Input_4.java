package hw.e04;

import java.util.Scanner;

public class Input_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Plesae enter word #1:  ");
        String word1 = sc.nextLine();
        System.out.printf("Plesae enter word #2:  ");
        String word2 = sc.nextLine();
        System.out.println(word1 + "\n" + word2);
        System.out.println(word1 + "  " + word2);
    }
}
