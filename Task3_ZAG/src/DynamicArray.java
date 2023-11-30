public class DynamicArray {
    int[] arrays;
    int size = 0;
    int count = 0;

    public DynamicArray(int n) {
        size = n;
        arrays = new int[size];
    }

    public DynamicArray() {
        size = 100;
        arrays = new int[size];
    }

    public void printArray() {
        for (int i = 0; i < count; i++) {
            System.out.println(arrays[i]);
        }
        System.out.println();
    }

    public void insert(int num) {
        if (count == size) {
            createArray();
        }
        arrays[count] = num;
        count++;
    }

    private void createArray() {
        size = size * 2;
        int[] newArray = new int[size];
        for (int i = 0; i < count; i++) {
            newArray[i] = arrays[i];
        }

        arrays = newArray;
    }

    public void removeAt(int index) {
        if (index < 0 || index > count)
            throw new IllegalStateException("not valid index");

        for (int i = index; i < count - 1; i++) {
            arrays[i] = arrays[i + 1];

        }
        count--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++) {
            if (item == arrays[i])
                return i;
        }
        return -1;
    }

    public void remove(int item) {
        int index = indexOf(item);
        if (index != -1)
            removeAt(index);

    }

    public int max() {
        int maxx = Integer.MIN_VALUE;
        for (int i = 0; i < count; i++) {

            if (arrays[i] > maxx) {
                maxx = arrays[i];
            }
        }
        return maxx;
    }

    public int min() {
        int minn = Integer.MAX_VALUE;
        for (int i = 0; i < count; i++) {
            if (arrays[i] < minn)
                minn = arrays[i];
        }
        return minn;
    }
}
