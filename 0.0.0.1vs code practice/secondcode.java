package second;

import java.util.Scanner;

public class secondcode {
	public static void main(String[] args) 
    {
        int n;
        try (Scanner s = new Scanner(System.in)) {
			System.out.print("Enter the number you want to check:");
			n = s.nextInt();
		}
        if(n % 2 == 0)
        {
            System.out.println("The given number "+n+" is Even ");
        }
        else
        {
            System.out.println("The given number "+n+" is Odd ");
	}
    }

}
