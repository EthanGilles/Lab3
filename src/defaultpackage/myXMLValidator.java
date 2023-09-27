package defaultpackage;

import java.util.*;

public class myXMLValidator implements IXMLValidator{
	
	
	/*
	 * Mason Beale
	 */
	public boolean validateXML(IStack stack, String inputXML) {
		int first = 0;
		int second = 1;
		while(second<inputXML.length()) {
			String tag = "";
			if(inputXML.charAt(first) == '<') {
				if(inputXML.charAt(second) == '/') {
					for(int i = second+1;inputXML.charAt(i)!= '>';i++) {
						tag += inputXML.charAt(i);
					}
					stack.pop();
				}else {
					for(int i = second;inputXML.charAt(i)!= '>';i++) {
						tag += inputXML.charAt(i);
					}
					stack.push(tag);
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
