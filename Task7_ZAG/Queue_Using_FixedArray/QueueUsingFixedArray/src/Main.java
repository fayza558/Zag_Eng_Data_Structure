import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        QueueUsingFixedArray queue = new QueueUsingFixedArray(7);
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);
        queue.enqueue(25);
        System.out.println("Peek is " + queue.peek());
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(30);
        queue.enqueue(45);
        System.out.println("Peek is " + queue.peek());
        queue.print();
        reverse(queue);
        System.out.println();
        queue.print();
        System.out.println();
        System.out.println("Peek is " + queue.peek());

    }

    //Time Complexity O(n)
    public static void reverse(QueueUsingFixedArray queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.dequeue());
        }
        while (!stack.isEmpty()) {
            queue.enqueue(stack.pop());
        }
    }
}