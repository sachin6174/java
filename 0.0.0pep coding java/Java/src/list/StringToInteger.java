package list;

//import java.util.Collections;
// string is built in
import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
//        String str = "1 2 3 4 5";
//            String arr[] = str.split(" ");
//            for (String x: arr) {
//                int element = Integer.parseInt(x);
//                System.out.println(element);
//        }
//
//        String str2 = "Sac8hin";
//        System.out.println(str2.substring(1));// if only begning specified  the we get complete string starting from that index
//        String str3 = "Sachin";
//        String str4 = new String("Sachin");
//        System.out.println(str2.equals(str3)); // compare value
//        System.out.println(str2 == str4); // compare address
//        System.out.println(str2.substring(0,5));// it will give from 0 to 5-1  (indexes)
//        System.out.println(str2.concat("58"));// to concatinate any string
//        System.out.println(str2.indexOf('i'));
//        System.out.println(str2.toUpperCase());
//        System.out.println(str2.toLowerCase());
//        System.out.println(str2.charAt(2));
//        /// string are immutable
//        System.out.println((int)str2.charAt(2));
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();// it break on enter
        String word = in.next();// break on enter and space
//        getline(cin,str,'$'); /// not fond in java
        System.out.println(line);
        System.out.println(line.length());
        System.out.println(word);

    }

}
