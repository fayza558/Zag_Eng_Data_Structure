public class Main {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue(10);
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);
        System.out.println("peek is " + queue.peek());
        queue.print();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(25);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.print();
        System.out.println("peek is " + queue.peek());
    }
}