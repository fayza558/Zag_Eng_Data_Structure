import java.util.LinkedList;
import java.util.NoSuchElementException;

public class HashTable_Using_Chaining {
    int count = 0;

    private class Node {
        private int key;
        private String value;

        public Node(int key, String value) {
            this.value = value;
            this.key = key;
        }
    }

    private LinkedList<Node>[] table;

    public HashTable_Using_Chaining(int value) {
        table = new LinkedList[value];
    }

    private int hash(int key) {
        return key % table.length;
    }


    public String get(int key) {
        int index = hash(key);
        if (table[index] == null) {
            return null;
        } else {
            for (Node e : table[index]) {
                if (e.key == key) {
                    return e.value;
                }
            }
        }

        return null;

    }

    public void put(int key, String value) {
        Node node = new Node(key, value);
        int index = hash(key);
        if (table[index] == null) {
            table[index] = new LinkedList<>();

        }
        for (Node e : table[index]) {
            if (e.key == key) {
                e.value = value;
                return;
            }
        }
        table[index].add(node);
        count++;
    }

    public void remove(int key) {
        int index = hash(key);
        if (table[index] == null) {
            throw new NoSuchElementException("the key is not exist");
        } else {
            for (Node e : table[index]) {
                if (e.key == key) {
                    table[index].remove(e);
                    count--;
                    return;
                }
            }
        }
        throw new NoSuchElementException("the key is not exist");
    }


    public int size() {
        return count;
    }


}
