public class Main {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
        array.insert(50);
        System.out.println(array.indexOf(30));
        System.out.println(array.indexOf(300));
        array.removeAt(1);
        array.remove(20);
        array.printArray();
        System.out.println("Maximum value: " + array.max());
        System.out.println("Minimum value: " + array.min());
    }
}