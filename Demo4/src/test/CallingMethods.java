/**
 * 
 */
package test;

/**
 * @author ctsuser1
 *
 */
public class CallingMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printOne();
		printOne();
		printTwo();


	}
	public static void printOne() {
		System.out.println("Hello World");
	}

	public static void printTwo() {
		printOne();
		printOne();
	}
}
