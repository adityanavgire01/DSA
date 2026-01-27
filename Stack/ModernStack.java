import java.util.ArrayDeque;
import java.util.Deque;

public class ModernStack {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);

        System.out.println(stack.peek());

        System.out.println(stack.pop());

        System.out.println(stack.isEmpty());

        stack.push(99);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        // System.out.println(stack.top());
        System.out.println(stack.pop());
        // System.out.println(stack.top(

        // System.out.println(stack.pop());

    }
}
