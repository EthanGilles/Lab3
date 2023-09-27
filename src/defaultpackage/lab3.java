package defaultpackage;

public class lab3 {

	public static void main(String[] args) {
		
		myXMLValidato validator = new myXMLValidato();
		
		XMLValidatorTester tester = new XMLValidatorTester();
		
		System.out.println(tester.precision(validator) + " was the accuracy of the 5 XML strings.");
		
	}
}
