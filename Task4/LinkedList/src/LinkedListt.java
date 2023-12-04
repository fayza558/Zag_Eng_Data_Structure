public class LinkedListt {
    public static class Node {
        public Node(int value) {
            this.value = value;
        }

        int value;
        Node nextNode;
    }

    Node head;
    Node tail;
    int size;

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.nextNode = head;
            head = newNode;
        }

        size++;
    }

    public void addLast(int item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.nextNode = newNode;
            //    newNode.next=null;
            tail = newNode;
        }
        size++;
    }

    public void removeFirst() {
        if (isEmpty()) {
            throw new RuntimeException("empty list");
        }
        if (head == tail) {
            head = tail = null;
        } else {
            //to save the address of the first element to make for there null at end
            Node temp = head;
            head = head.nextNode;
            temp.nextNode = null;
        }
        size--;
    }

    public void removeLast() {
        if (isEmpty()) {
            throw new RuntimeException("empty list");
        }
        if (head == tail) {
            head = tail = null;
        } else {
            Node beforeLast = getBeforeLast();
            tail = beforeLast;
            tail.nextNode = null;
        }
        size--;
    }

    private Node getBeforeLast() {
        Node beforeLast = head;
        Node current = head;
        while (current.nextNode != null) {
            beforeLast = current;
            current = current.nextNode;
        }
        return beforeLast;
    }

    public int size() {
        return size;
    }

    public int indexOf(int item) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.value == item) {
                return index;
            }
            index++;
            current = current.nextNode;
        }
        return -1;
    }

    public boolean contains(int value) {
        int index = indexOf(value);
        return index != -1;
    }


}