package fifihcode;

import java.util.Scanner;

public class fifthrtwo {
	 public static void main(String[] input)
	    {
	        String strUpper, strLower;
	        try (Scanner scan = new Scanner(System.in)) {
				System.out.print("Enter one word/name in Uppercase : ");
				strLower = scan.nextLine();
			}
	        
	        strUpper = strLower.toLowerCase();
	        System.out.print("Equivalent Word/Name in Lowercase : " +strUpper);
	    }
}
