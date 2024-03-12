public class Main {
    public static void main(String[] args) {

        HashTable_Using_Chaining hash = new HashTable_Using_Chaining(10);
        hash.put(1, "fff");
        hash.put(2, "aaa");
        hash.put(3, "yyy");
        hash.put(4, "zzz");
        hash.put(5, "aaa");
        System.out.println(hash.get(1));
        hash.remove(2);
        System.out.println(hash.size());

    }
}