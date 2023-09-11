package hw.e02;

public class HW2_Output2 {
    public static void main(String[] args) {
        for (int i = 0; i<3; i++)
            System.out.println(" ".repeat(7) + "|" + " ".repeat(7) + "|" + " ".repeat(7));
        System.out.println("-".repeat(23));
        for (int i = 0; i<3; i++) {
            if (i != 1)
                System.out.println(" ".repeat(7) + "|" + " ".repeat(7) + "|" + " ".repeat(7));
            else
                System.out.println(" ".repeat(7) + "|" + " ".repeat(3) + "X" + " ".repeat(3) + "|" + " ".repeat(7));
        }
        System.out.println("-".repeat(23));
        for (int i = 0; i<3; i++)
            System.out.println(" ".repeat(7) + "|" + " ".repeat(7) + "|" + " ".repeat(7));
    }
}
