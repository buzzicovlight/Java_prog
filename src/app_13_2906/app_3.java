package app_13_2906;

import java.util.PriorityQueue;

public class app_3 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(3);
        priorityQueue.add(1);
        priorityQueue.add(32132);
        priorityQueue.add(-1);
        priorityQueue.add(15465465);
        priorityQueue.add(-15465465);
        System.out.println("Содржимое PriorityQueue");
        for (Integer i:
             priorityQueue) {
            System.out.println(i);
        }
        System.out.println("Содржимое PriorityQueue");
        while(!priorityQueue.isEmpty()){
            Integer i = priorityQueue.poll();
            System.out.println(i);
        }

    }
}
