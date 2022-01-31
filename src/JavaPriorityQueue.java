import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class JavaPriorityQueue {
    public static void main(String[] args){
        //removes smallest elements first
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(11);
        pq.offer(33);
        pq.offer(22);
        pq.offer(44);

        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.peek());

        //removes largest element first
        System.out.println("Priority queue with largest element first");
        Queue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
        pq1.offer(11);
        pq1.offer(33);
        pq1.offer(22);
        pq1.offer(44);
        System.out.println(pq1);

        System.out.println(pq1.poll());
        System.out.println(pq1);
        System.out.println(pq1.poll());
        System.out.println(pq1);
        System.out.println(pq1.peek());


    }
}
