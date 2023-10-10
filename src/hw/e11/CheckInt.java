package hw.e11;

import java.util.Random;

public class CheckInt {
    private static int boolToInt(boolean bool) {
        // true: 0, false: 1
        return bool ? 0 : 1;
    }
    public static boolean isPositive(int i) {
        if (i == 0) {
            // 0 is not a positive or a negative number,
            // so throw an exception.
            throw new ArithmeticException(
                    "Malformed input, 0 is neither positive nor negative"
            );
        }
        switch (CheckInt.boolToInt(i > 0)) {
            // case 0: i is greater than 0
            case 0 -> {
                // continuously subtract from i until i is 0
                while (i > 0) {
                    i--;
                }
            }
            // case 1: i is less than 0
            case 1 -> {
                // continuously add to i until i is -1
                while (i < -1) {
                    i++;
                }
            }
        }
        // if i is 0, the original number is positive.
        // if i is -1, the original number is negative.
        return i == 0;
    }

    private static int getAbsoluteValue(int i) {
        // get and return the absolute value of the given integer
        // (simply negate the value if the value is negative)
        if (i < 0) {
            return -i;
        } return i;
    }
    public static boolean isEven(int i) {
        // remove the negative sign (if there is one)
        i = CheckInt.getAbsoluteValue(i);

        // subtract from i until i is 1 or 2
        while (!(i == 0 || i == 1)) {
            i -= new Random().nextInt(2,3);
        }

        // check if i is divisible by 2
        // if yes, it is even
        // if no, it is odd
        return i == 0;
    }

    public static boolean multiple7(int i) {
        return false;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++){
            System.out.println(isEven(13));
            System.out.println(isEven(0));
        }
    }
}
