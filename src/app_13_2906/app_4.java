package app_13_2906;

import java.util.Comparator;
import java.util.PriorityQueue;

public class app_4 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>( new ReverseComporator());
        priorityQueue.add(234);
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(3);
        priorityQueue.add(-23423);
        priorityQueue.add(-234);
        System.out.println();
        while(!priorityQueue.isEmpty()){
            Integer i = priorityQueue.poll();
            System.out.println(i);
        }

    }
}
class ReverseComporator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return -1*Integer.compare(o1,o2);
    }

}