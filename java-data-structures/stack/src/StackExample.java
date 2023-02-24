import java.util.ArrayDeque;
import java.util.Deque;

public class StackExample {

    public static void main(String[] args) {

        Deque<String> stack = new ArrayDeque<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
        stack.poll();
        System.out.println(stack);
    }
}
