public class QueueUsingFixedArray {
    int[] items;
    int size = 0, count = 0;
    int first, last;

    public QueueUsingFixedArray(int size) {
        this.size = size;
        items = new int[size];
    }

    //Time Complexity O(1)
    public boolean isEmpty() {
        return count == 0;
    }

    //Time Complexity O(1)
    public boolean isFull() {
        return count == size;
    }

    //Time Complexity O(1)
    public void enqueue(int item) {
        if (isFull()) {
            throw new IllegalStateException();
        }
        items[last] = item;
        last = (last + 1) % size;
        count++;

    }

    //Time Complexity O(1)
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        int temp = items[first];
        items[first] = 0;
        first = (first + 1) % size;
        count--;
        return temp;

    }

    //Time Complexity O(1)
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        int temp = items[first];
        return temp;

    }

    //Time Complexity O(1)
    public int size() {
        return count;
    }

    //Time Complexity O(n)
    public void print() {
        System.out.print("[ ");
        if (!isEmpty()) {
            System.out.print(items[first]);
            int current = (first + 1) % size;
            while (current != last) {
                System.out.print(", " + items[current]);
                current = (current + 1) % size;
            }
            System.out.print(" ]");
        }
    }


}
