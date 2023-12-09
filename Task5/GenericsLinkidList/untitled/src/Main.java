public class Main {
    public static void main(String[] args) {
        GenericLinkedList linkedlist1 = new GenericLinkedList();
        linkedlist1.addFirst(12);
        linkedlist1.addFirst(13);
        linkedlist1.addFirst(15);
        linkedlist1.addFirst(1);
        linkedlist1.addLast(14);
        linkedlist1.removeFirst();
        linkedlist1.removeLast();
        linkedlist1.indexOf(15);
        linkedlist1.contains(12);
        linkedlist1.reverse();

    }
}