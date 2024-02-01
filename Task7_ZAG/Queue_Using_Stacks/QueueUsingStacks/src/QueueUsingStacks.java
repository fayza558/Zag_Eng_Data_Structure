import java.util.Stack;

public class QueueUsingStacks {

    private final Stack<Integer> stack1 = new Stack<>();
    private final Stack<Integer> stack2 = new Stack<>();
    private final int maxSize;
    private int count = 0;


    public QueueUsingStacks(int maxSize) {
        this.maxSize = maxSize;
    }

    //Time Complexity O(1)
    public void enqueue(int item) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
        stack1.push(item);
        count++;
    }

    //Time Complexity O(n)
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException();
        }
        if (stack2.isEmpty()) {
            moveStackOneToStackTwo();
        }
        count--;
        return stack2.pop();


    }

    //Time Complexity O(n)
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException();
        }
        if (stack2.isEmpty()) {
            moveStackOneToStackTwo();
        }
        return stack2.peek();
    }

    //Time Complexity O(1)
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    // Time Complexity O(1)
    public boolean isFull() {
        return count == maxSize;
    }

    //Time Complexity O(n)
    public void moveStackOneToStackTwo() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }

    //Time Complexity O(n)
    public void print() {

        if (isEmpty()) {
            throw new RuntimeException();
        }
        Stack<Integer> tempStack = new Stack<>();
        while (!stack2.isEmpty()) {
            tempStack.push(stack2.pop());
        }


        while (!stack1.isEmpty()) {
            tempStack.push(stack1.pop());
        }


        System.out.print("[");
        while (!tempStack.isEmpty()) {
            int item = tempStack.pop();
            System.out.print(" " + item);
            stack1.push(item);
        }
        System.out.print(" ]");


    }

    //Time Complexity O(1)
    public int size() {
        return count;
    }
}
