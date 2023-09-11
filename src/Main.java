public class Main {
    public static void main(String[] args) {
        for(double i: ku.range(15000))
            System.out.println("|".repeat((int)i));
    }
}
