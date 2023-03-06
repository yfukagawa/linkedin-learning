import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        myStack();

    }

    public static void myStack () {
        Stack stack =  new Stack();
        stack.push("first");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.push("second");
        System.out.println(stack);
    }
}