import java.util.*;

public class myXMLValidator implements IXMLValidator{

	public static void main(String[] args) {
		myStack nStack = new myStack();
		String str = "<bookstore>"
				+ "<book>"
				+ "<title>The Great Gatsby</title>"
				+ "</book>"
				+ "<book>"
				+ "<title>The Power of Now</title>"
				+ "<year>1997</year>"
				+ "</book>"
				+ "</bookstore>";
		String strBad = "<bookstore>\r\n"
				+ "<book>\r\n"
				+ "<title>The Great Gatsby</title>\r\n"
				+ "</book>\r\n"
				+ "<book>\r\n"
				+ "<title>The Power of Now</title>\r\n"
				+ "<year>1997</year>\r\n"
				+ "</bookstore>";
		myXMLValidator XMLVal= new myXMLValidator();
		System.out.println(XMLVal.validateXML(nStack, strBad));

	}
	public boolean validateXML(myStack stack, String inputXML) {
		int first = 0;
		int second = 1;
		while(second<inputXML.length()) {
			System.out.println(stack);
			String tag = "";
			if(inputXML.charAt(first) == '<') {
				if(inputXML.charAt(second) == '/') {
					System.out.println(tag);
					for(int i = second+1;inputXML.charAt(i)!= '>';i++) {
						tag += inputXML.charAt(i);
					}
					myStack.remove(tag);
				}else {
					for(int i = second;inputXML.charAt(i)!= '>';i++) {
						tag += inputXML.charAt(i);
					}
					System.out.println(tag);
					myStack.push(tag);
				}
				
			}
			first++;
			second++;
		}
		if(stack.isEmpty() == true) {
			return true;
		}
			
		return false;
	}

}
