public class CheckPositiveOrNegativeExample1  
{  
public static void main(String[] args)   
{  
Scanner sc=new Scanner(System.in);
//number to be check  
System.out.print("enter number"); 
int num=sc.nextInt();
//checks the number is greater than 0 or not  
if(num>0)  
{  
System.out.println("The number is positive.");  
}
//checks the number is less than 0 or not  
else if(num<0)  
{  
System.out.println("The number is negative.");  
}  
//executes when the above two conditions return false  
else  
{  
System.out.println("The number is zero.");  
}  
}  
}  