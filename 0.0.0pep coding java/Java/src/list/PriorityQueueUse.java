package list;

import java.util.PriorityQueue;

public class PriorityQueueUse {
    public static void main(String[] args) {
//        System.out.println("sachin");
        PriorityQueue<Integer>pq=new PriorityQueue<>();// min heap
        for(int i=10;i>=0;i--){
            pq.add(i);
        }

        System.out.println(pq);
    }

}
