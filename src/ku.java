import java.util.*;
import java.util.function.Consumer;

public class ku {
	/**
	 * Prints the object to the console
	 * @param o The object to print
	 */
	public static void println(Object o){
		System.out.println(o);
	}
	/**
	 * Prints the object to the console
	 * @param o The object to print
	 */
	public static void print(Object o) {
		System.out.println(o);
	}
	/**
	 * Prints the object to the console
	 * @param o The object to print
	 */
	public static void printf(Object o){
		System.out.printf((String) o);
	}
	/**
	 * Prints a message and waits for console input
	 * @param i Input message
	 */
	public static String input(String i){
		Scanner sc=new Scanner(System.in);
		ku.printf(i);
		String s = sc.nextLine();
		return s;
	}
	/**
	 * waits for console input
	 */
	public static String input(){
		Scanner sc=new Scanner(System.in);
		ku.printf("");
        return sc.nextLine();
	}

	/**
	 * Returns a double array from 0 to bound
	 * @param bound The upper bound of the range
	 * @return A double array from 0 to bound
	 */
	public static double[] range(double bound) {
		double[] a = new double[(int)bound];
		for (int i=0; i<bound;i++){
			a[i]=(double)i;
		}
		return a;
	}

	/**
	 * Returns a double array from lbound to rbound
	 * @param lbound The lower bound of the range
	 * @param rbound The upper bound of the range
	 * @return A double array from lbound to rbound
	 */
	public static double[] range(double lbound, double rbound){
		double[] a = new double[(int)(rbound-lbound)];
		for (int i = (int)lbound; i < rbound; i++) {
			a[i-(int)lbound] = i;
		}
		return a;
	}
	/**
	 * Returns an int array from 0 to bound
	 * @param bound The upper bound of the range
	 * @return An int array from 0 to bound
	 */
	public static int[] range(int bound){
		int[] a = new int[bound];
		for (int i=0; i < bound; i++) {
			a[i] = i;
		}
		return a;
	}
	/**
	 * Returns an int array from lbound to rbound
	 * @param lbound The lower bound of the range
	 * @param rbound The upper bound of the range
	 * @return An int array from lbound to rbound
	 */
	public static int[] range(int lbound, int rbound) {
		int[] a = new int[rbound-lbound];
		for (int i = lbound; i < rbound; i++) {
			a[i-lbound] = i;
		}
		return a;
	}
	/**
	 * Returns a long array from 0 to bound
	 * @param bound The upper bound of the range
	 * @return A long array from 0 to bound
	 */
	public static long[] range(long bound) {
		long[] a = new long[(int)bound];
		for (int i = 0; i < bound; i++) {
			a[i] = (int)i;
		}
		return a;
	}
	/**
	 * Returns a long array from lbound to rbound
	 * @param lbound The lower bound of the range
	 * @param rbound The upper bound of the range
	 * @return A long array from lbound to rbound
	 */
	public static long[] range(long lbound, long rbound) {
		long[] a = new long[(int) (rbound - lbound)];
		for (int i = (int)lbound; i < rbound; i++) {
			a[i - (int)lbound] = i;
		}
		return a;
	}

	/**
	 * Converts an object to a double
	 * @param s The object to convert to a double
	 * @return The double value of the object
	 */
	public static double toDouble(Object s) {
		return Double.parseDouble(s.toString());
	}
	/**
	 * Converts an object to an Int
	 * @param s The object to convert to an int
	 * @return The int value of the object
	 */
	public static int toInt(Object s) {
		return Integer.parseInt(s.toString());
	}
	/**
	 * Converts an object to a long
	 * @param s The object to convert to a long
	 * @return The long value of the object
	 */
	public static long toLong(Object s) {
		return Long.parseLong(s.toString());
	}

	/**
	 * A Javascript-like forEach loop
	 * @param array The array to iterate over
	 * @param action The action to perform on each item
	 */
	public static void forEach(Object[] array, Consumer<Object> action) {
		for (Object item: array) {
			action.accept(item);
		}
	}

	public static int max(int a, int b) {
		return Math.max(a, b);
	}
	public static double max(double a, double b){
		return Math.max(a, b);
	}
	public static Object max(Object[] a) {
		Arrays.sort(a);
		return a[-1];
	}
	public static int min(int a, int b) {
		return Math.min(a, b);
	}
	public static double min(double a, double b) {
		return Math.min(a, b);
	}
	public static Object min(Object[] a) {
		Arrays.sort(a);
		return a[0];
	}
	public static Object sort(Object[] a){
		Arrays.sort(a);
		return a;
	}
	public static int randInt() {
		Random random = new Random();
		return random.nextInt();
	}
	public static int randInt(int bound) {
		Random random = new Random();
		return random.nextInt(bound);
	}
	public static int randInt(int origin, int bound) {
		Random random = new Random();
		return random.nextInt(origin, bound);
	}
	public static double randDouble() {
		Random random = new Random();
		return random.nextDouble();
	}
	public static double randDouble(double bound) {
		Random random = new Random();
		return random.nextDouble(bound);
	}
	public static double randDouble(double origin, double bound) {
		Random random = new Random();
		return random.nextDouble(origin, bound);
	}
	public static Object randChoice(Object[] a) {
		Random random = new Random();
		return a[random.nextInt(a.length)];
	}
	public static char randChar() {
		Random random = new Random();
		return (char)random.nextInt(0, 65535);
    }
}

class List {
	public Object a;

	public List(Object a) {
		this.a = a;
	}

	public void set(Object a) {
		this.a = a;
	}
	public Object get() {
		return this.a;
	}

	public static List from(Object a) {
		return new List(a);
	}

	public Object export() {
		return this.get();
	}
	public void reset() {
		this.a = null;
	}
}

class Lists {
	public ArrayList list;

	public Lists() {
		list = new ArrayList<List>();
	}
	public Lists(ArrayList<List> list) {
		this.list = list;
	}
	public static Lists from(ArrayList<List> list) {
		return new Lists(list);
	}
}
