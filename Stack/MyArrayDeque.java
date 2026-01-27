import java.util.ArrayDeque;
import java.util.Deque;

public class MyArrayDeque {
    public static void main(String[] args) {
        Deque<Integer> s = new ArrayDeque<Integer>();

        s.push(20);
        s.push(4);
        s.push(10);

        System.out.println("Full Stack " + s);
        s.pop();
        System.out.println("Top element removed: " + s);
        s.pop();
        System.out.println("One more removed - Current top: " + s.peek());
        s.pop();
        System.out.println("One more removeed: " + s);
    }
}