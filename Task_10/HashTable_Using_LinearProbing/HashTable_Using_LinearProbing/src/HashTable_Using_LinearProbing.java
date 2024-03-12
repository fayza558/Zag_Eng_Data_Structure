import java.util.NoSuchElementException;

public class HashTable_Using_LinearProbing {

    private int[] keys;
    private String[] values;
    private int capacity;
    private int count;

    public HashTable_Using_LinearProbing(int capacity) {
        this.capacity = capacity;
        keys = new int[capacity];
        values = new String[capacity];
        count = 0;
    }

    private int hash(int key) {
        return key % capacity;
    }

    public String get(int key) {
        int index = hash(key);
        while (keys[index] != 0) {
            if (keys[index] == key) {
                return values[index];
            }
            index = (index + 1) % capacity;
        }
        return null;
    }

    public void put(int key, String value) {
        if (count == capacity) {
            throw new IllegalStateException("Hash table is full");
        }

        int index = hash(key);
        while (keys[index] != 0 && keys[index] != key) {
            index = (index + 1) % capacity;
        }

        if (keys[index] == 0) {
            keys[index] = key;
            values[index] = value;
            count++;
        } else {
            // Key already exists, update the value
            values[index] = value;
        }
    }

    public void remove(int key) {
        int index = hash(key);
        while (keys[index] != 0) {
            if (keys[index] == key) {
                keys[index] = 0;
                values[index] = null;
                count--;
                return;
            }
            index = (index + 1) % capacity;
        }
        throw new NoSuchElementException("Key not found");
    }

    public int size() {
        return count;
    }
}


