package list;

import java.util.*;

public class ArrayListUse {
    public static void main(String[] args) {
//        int is primitive
//        Integer is wrapper
//        Character is wrapper
//        all primitive data types have wrapper class
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer>arr = new ArrayList<Integer>();
        ArrayList<Integer>arr1 = new ArrayList<>(Collections.nCopies(10,69));
        System.out.print("arr1 = " + arr1);
        System.out.println();
        System.out.printf("%d%c\n\t",5,'o');
        arr.add(19);
        arr.add(12);
        arr.add(31);
        arr.add(4);
        arr.add(50);
//        arr.clear();
        arr.add(2,69);
        arr.set(0,-1);

        for(int element : arr){
            System.out.print(element + " ");
        }

        System.out.println();

        Collections.sort(arr);
        for(int element : arr){
            System.out.print(element + " ");
        }

        System.out.println();

        Collections.reverse(arr);
        for(int element : arr){
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println();
        //Iterator
        for(Iterator it = arr.iterator(); it.hasNext() ;){
            System.out.println(it.next());
        }


        //while loop

        int i = 0;
        int n = 5;
//        while(i  < 5){
//            System.out.println("Hello");
//            i++;
//        }

        //for loop
        // for does not have its local scope for i
        for(i=0;i<10;i++){

        }

        //for each loop


//        do{
//            System.out.println("sachin");
//            i++;
//        }while(i<5);



//      max
        System.out.println(Collections.max(arr));
        //min

        System.out.println(Collections.min(arr));
//        //sum
//        System.out.println(Collections.(arr));

        sc.close();
    }
}
