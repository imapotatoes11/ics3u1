package hw.e11;

public class PassTest {
    public static void main(String[] args) {
        long res = 0;
        for (int i = 0; i < 500; i++) {
            HoldList list = HoldList.randomExpression();
            double result = list.evaluate();
            res += (long) result;
            System.out.printf("%70s = %,.2f\n", list, result);
        }
        System.out.println(res/500);
    }
}
