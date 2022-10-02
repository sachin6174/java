package list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Maxfreq {
    public static void main(String[] args) {
        ArrayList<Character>arr=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++){
            char a=sc.next().charAt(0);
            arr.add(a);
        }
        HashMap<Character,Integer>mp=new HashMap<>();
        for(char a:arr){
            if(mp.containsKey(a)){
                int val=mp.get(a);
                mp.put(a,1+val);
            }else {
                mp.put(a, 1);
            }
        }
        System.out.println(mp);

    }
}
