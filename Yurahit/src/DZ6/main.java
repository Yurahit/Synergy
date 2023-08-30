package DZ6;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class main {
    public static void main(String[] args) {
        MyIntPriorityQueue myIntPriorityQueue = new MyIntPriorityQueue(3);
        myIntPriorityQueue.enqueue(32);
        myIntPriorityQueue.enqueue(98);
        myIntPriorityQueue.enqueue(334);
        System.out.println(myIntPriorityQueue.pop());
        System.out.println(myIntPriorityQueue.pop());
        System.out.println(myIntPriorityQueue.pop());
        myIntPriorityQueue.enqueue(54);
    }
}
