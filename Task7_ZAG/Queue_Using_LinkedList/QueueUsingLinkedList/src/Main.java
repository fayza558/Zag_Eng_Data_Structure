
public class Main {
    public static void main(String[] args) {
        QueueUsingLinkedList queueContainer = new QueueUsingLinkedList();
        QueueUsingLinkedList.Queue queue = queueContainer.new Queue(10);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.dequeue();
        queue.dequeue();
        queue.print();
        System.out.println(queue.peek());
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);
        queue.dequeue();
        queue.dequeue();
        queue.print();
        System.out.println(queue.peek());

    }


}