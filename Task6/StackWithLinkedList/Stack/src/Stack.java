public class Stack {
    private class Node {
        int value;
        Node button;
    }

    Node top;

    private boolean isEmpty() {
        return top == null;
    }

    public void push(int value) {
        Node node = new Node();
        node.button = top;
        node.value = value;
        top = node;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        int value = top.value;
        top = top.button;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        return top.value;
    }
}
