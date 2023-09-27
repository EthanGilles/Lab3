
/**
 * 
 * @author James Libby
 *
 */
public class XMLvalidatorTester{
    IStack stack;
    public XMLvalidatorTester(IStack stack) {
        this.stack = stack;
    }
    
    public double precision(IXMLValidator x) {
        String[] string = new String[5];      
        string[0] = "<bookstore>";
        string[1] = "<book>a </book>";
        string[2] = "<title>The Great Gatsby</title>";
        string[3] = "</book>";
        string[4] = "<book>"; 
        double countCorrect = 0;
        for(int i = 0; i < string.length; i++) {
            if (x.validateXML(stack, string[i]) == true)
                countCorrect++;
        }
        return countCorrect/5;       
    }
}
