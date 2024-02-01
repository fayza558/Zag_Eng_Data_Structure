public class Main {
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks(10);
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
        queue.print();
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.dequeue();
        queue.dequeue();
        queue.print();
        System.out.println(queue.size());

    }
}