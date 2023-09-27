package defaultpackage;

public class lab3 {
	
	/*
	 * Ethan Gilles
	 * makes an Istack, a validator and tester object then prints the accuracy.
	 */
	public static void main(String[] args) {
		IStack stack = new myStack();
		
		myXMLValidator validator = new myXMLValidator();
		
		XMLvalidatorTester tester = new XMLvalidatorTester(stack);
		
		System.out.println(tester.precision(validator) + " was the accuracy of the 5 XML strings.");
		
	}
}
