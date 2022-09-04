import java.util.Scanner;

public class sixthcode {

    public static void main(String[] args) 
    {
        try (Scanner colour = new Scanner(System.in)) {
			System.out.print("Enter the character(R/B/G/O/Y/W): ");
      char clr = colour.next().charAt(0);
      switch(clr)
      {
			   case 'R':
			       System.out.println("Red");
			       break;
			   case 'B':
			       System.out.println("Blue");
			       break;
			   case 'G':
			       System.out.println("Green");
			       break;
			   case 'O':
			       System.out.println("Orange");
			       break;
			   case 'Y':
			       System.out.println("Yellow");
			       break;
			   case 'W':
			       System.out.println("White");
			       break;
			   default:
			       System.out.println("Invalid Code");
			       break;
      }
		}
    }

}
	
