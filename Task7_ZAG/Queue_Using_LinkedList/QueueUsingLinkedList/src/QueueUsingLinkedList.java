public class QueueUsingLinkedList<T> {
    public static class Node<T> {
        public Node(int value) {
            this.value = value;
        }

        int value;
        Node nextNode;
    }

    class Queue {
        private Node first, last;
        private int count;
        private final int maxSize;

        public Queue(int maxSize) {
            this.first = this.last = null;
            this.count = 0;
            this.maxSize = maxSize;
        }

        //Time Complexity O(1)
        public void enqueue(int value) {
            if (isFull()) {
                throw new IllegalStateException();
            }
            Node newNode = new Node(value);
            if (last == null) {
                first = last = newNode;
                return;
            }
            last.nextNode = newNode;
            last = newNode;
            count++;

        }

        //Time Complexity O(1)
        public int dequeue() {
            if (isEmpty()) {
                throw new RuntimeException();
            }

            int temp = first.value;
            first = first.nextNode;
            count--;
            if (first == null) {
                last = null;
            }
            return temp;

        }

        //Time Complexity O(1)
        public int peek() {
            if (isEmpty()) {
                throw new RuntimeException();
            }
            int temp = first.value;
            return temp;
        }

        //Time Complexity O(1)
        public boolean isEmpty() {
            return first == null;
        }

        //Time Complexity O(1)
        public int size() {
            return count;
        }

        //Time Complexity O(1)
        public boolean isFull() {
            return count == maxSize;
        }

        //Time Complexity O(n)
        public void print() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }

            Node current = first;
            System.out.print('[');
            while (current != null) {
                System.out.print(current.value + " ");
                current = current.nextNode;
            }
            System.out.print(']');
        }
    }

}