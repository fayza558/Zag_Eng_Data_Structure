public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(11);
        s.push(12);
        s.push(13);
        s.push(14);
        s.pop();
        System.out.println(s.peek());
    }
}