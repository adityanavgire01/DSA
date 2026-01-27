class MyStack {
    private int[] arr;
    private int capacity;
    private int top;

    public MyStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int ele) {
        if (isFull()) {
            System.out.println("Stack Overflow.. Cannot add ele: " + ele);
            return;
        }

        top++;
        arr[top] = ele;
        System.out.println("Element pushed to stack " + ele);
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow, Cannot pop anymore elements..");
            return;
        }

        int popped = arr[top];
        top--;
        System.out.println("Popped element: " + popped);
    }

    public boolean isFull() {
        return top == capacity - 1;

    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return arr[top];
    }

}

public class Main1 {
    public static void main(String[] args) {
        MyStack stack = new MyStack(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Top element is: " + stack.peek());

        stack.pop();
        System.out.println("New Top element: " + stack.peek());

    }
}