import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
public class QueueExample {

    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<>();
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);

        Queue<String> queue1 = new PriorityQueue<>();
        queue1.offer("One");
        queue1.offer("Two");
        queue1.offer("Three");
        System.out.println(queue1);
        System.out.println(queue1.peek());
        queue1.poll();
        System.out.println(queue1);

    }
}
