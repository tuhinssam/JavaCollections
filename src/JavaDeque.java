import java.util.ArrayDeque;
import java.util.Deque;

public class JavaDeque {
    public static void main(String[] args){
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(11);
        deque.offerFirst(22); //adds in front
        deque.offerLast(33); //adds in Rear
        deque.offer(44); //adds in Rear
        System.out.println(deque);

        System.out.println(deque.peekFirst());
        System.out.println(deque.poll()); // removes from front
        System.out.println(deque.pollFirst());
        System.out.println(deque.peek()); //get element from front
        System.out.println(deque.pollLast());
        System.out.println(deque.peekLast());
    }
}
