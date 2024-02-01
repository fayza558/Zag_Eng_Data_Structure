public class PriorityQueue {
    private int count = 0;
    private int[] array;
    int size;

    public PriorityQueue(int size) {
        this.size = size;
        array = new int[size];
    }

    //Time Complexity O(n)
    public void enqueue(int item) {
        if (isFull()) {
            throw new RuntimeException();
        }
        int i = getIndex(item);
        array[i] = item;
        count++;
    }

    //Time Complexity O(n)
    private int getIndex(int item) {
        int i = count - 1;
        for (; i >= 0; i--) {
            if (array[i] > item) {
                array[i + 1] = array[i];
            } else {
                break;
            }
        }
        return i + 1;
    }

    //Time Complexity O(n)
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException();
        }
        int temp = array[0];
        for (int i = 0; i < count - 1; i++) {
            array[i] = array[i + 1];
        }
        count--;
        return temp;

    }

    //Time Complexity O(n)
    public void print() {
        System.out.print('[');
        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.print(']');
        System.out.println();
    }

    //Time Complexity O(1)
    public int peek() {
        return array[0];
    }

    //Time Complexity O(1)
    public boolean isFull() {
        return count == size;
    }

    //Time Complexity O(1)
    public boolean isEmpty() {
        return count == 0;
    }

    //Time Complexity O(1)
    public int size() {
        return count;
    }
}
