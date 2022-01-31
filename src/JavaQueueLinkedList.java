import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class JavaQueueLinkedList {
    public static void main(String[] args){
        //queue implements linkedlist interface
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        list.add(16);
        list.add(32);
        list.add(64);
        queue.offer(11);
        queue.offer(22);
        queue.offer(33);
        System.out.println(queue);

        //remove element from front
        System.out.println(queue.poll());
        System.out.println(queue);
        //get element from queue but don't remove it
        System.out.println(queue.peek());
        //check if queue is empty
        System.out.println(queue.isEmpty());
        //appends another list to queue
        queue.addAll(list);
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}
