package hw.e02;

public class HW2_Output4 {
    public static void main(String[] args) {
        System.out.println("Num   Square");
        System.out.println("***   ******");
        System.out.println("1     " + (int)Math.pow(1,2));
        System.out.println("2     " + (int)Math.pow(2,2));
        System.out.println("3     " + (int)Math.pow(3,2));
        System.out.println("4     " + (int)Math.pow(4,2));
        System.out.println("5     " + (int)Math.pow(5,2));
        System.out.println();
        System.out.println("1*1 = " + (int)Math.pow(1,2));
        System.out.println("2*2 = " + (int)Math.pow(2,2));
        System.out.println("3*3 = " + (int)Math.pow(3,2));
        System.out.println("4*4 = " + (int)Math.pow(4,2));
        String[] res = {
                "Num   Square",
                "***   ******",
                "1     " + (int)Math.pow(1,2),
                "2     " + (int)Math.pow(2,2),
                "3     " + (int)Math.pow(3,2),
                "4     " + (int)Math.pow(4,2),
                "5     " + (int)Math.pow(5,2),
                "",
                "1*1 = " + (int)Math.pow(1,2),
                "2*2 = " + (int)Math.pow(2,2),
                "3*3 = " + (int)Math.pow(3,2),
                "4*4 = " + (int)Math.pow(4,2)
        };
        for (String s : res) {
            System.out.println(s);
        }
    }
}
