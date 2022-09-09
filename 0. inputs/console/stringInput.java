import java.util.Scanner;

public class stringInput {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
            /*
            nextBoolean()	Reads a boolean value from the user
            nextByte()	Reads a byte value from the user
            nextDouble()	Reads a double value from the user
            nextFloat()	Reads a float value from the user
            nextInt()	Reads a int value from the user
            nextLine()	Reads a String value from the user
            nextLong()	Reads a long value from the user
            nextShort()	Reads a short value from the user
         */
    int a = myObj.nextInt();// int input
    float b = myObj.nextFloat(); // float input
    System.out.println(a+b);
    //boolean b1 = sc.hasNextBoolean();// return true if value entered is boolean
    // String str = myObj.next(); // read till space 
    //String name = myObj.nextLine(); //read complete line including space
    // String input
    String name = myObj.nextLine();
    String str = myObj.next();
    System.out.println(name);
    System.out.println(str);
    myObj.close();
  }
}
