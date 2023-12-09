public class GenericLinkedList<E> {

    public static class Node<E> {
        public Node(E value) {
            this.value = value;
        }

        E value;
        Node<E> nextNode;
    }

    Node<E> head;
    Node<E> tail;
    int size;

    //Time Complexity: O(1)
    public boolean isEmpty() {
        return head == null;
    }

    //Time Complexity: O(1)
    public void addFirst(E item) {
        Node<E> newNode = new Node<>(item);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.nextNode = head;
            head = newNode;
        }

        size++;
    }

    //Time Complexity: O(1)
    public void addLast(E item) {
        Node<E> newNode = new Node<>(item);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.nextNode = newNode;
            tail = newNode;
        }
        size++;
    }

    //Time Complexity: O(1)
    public void removeFirst() {
        if (isEmpty()) {
            throw new RuntimeException("empty list");
        }
        if (head == tail) {
            head = tail = null;
        } else {
            Node<E> temp = head;
            head = head.nextNode;
            temp.nextNode = null;
        }
        size--;
    }

    //Time Complexity: O(n)
    public void removeLast() {
        if (isEmpty()) {
            throw new RuntimeException("empty list");
        }
        if (head == tail) {
            head = tail = null;
        } else {
            Node<E> beforeLast = getBeforeLast();
            tail = beforeLast;
            tail.nextNode = null;
        }
        size--;
    }

    //Time Complexity: O(n)
    private Node<E> getBeforeLast() {
        Node<E> beforeLast = head;
        Node<E> current = head;
        while (current.nextNode != null) {
            beforeLast = current;
            current = current.nextNode;
        }
        return beforeLast;
    }

    // Time Complexity: O(1)
    public int size() {
        return size;
    }

    //Time Complexity: O(n)
    public int indexOf(E item) {
        Node<E> current = head;
        int index = 0;
        while (current != null) {
            if (current.value.equals(item)) {
                return index;
            }
            index++;
            current = current.nextNode;
        }
        return -1;
    }

    //Time Complexity: O(n)
    public boolean contains(E value) {
        return indexOf(value) != -1;
    }

    //Time Complexity: O(n)
    public void reverse() {
        if (isEmpty())
            return;
        Node previous = head;
        Node current = head.nextNode;
        while (current != null) {
            Node next = current.nextNode;
            current.nextNode = previous;
            previous = current;
            current = next;
        }
        Node temp = head;
        head = tail;
        tail = temp;
        tail.nextNode = null;
    }
}


