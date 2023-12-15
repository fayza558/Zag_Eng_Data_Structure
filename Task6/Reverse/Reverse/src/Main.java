import java.util.Stack;

public class Main {


    public static void main(String[] args) {
        System.out.println(reverse("abcdef"));
    }

    public static String reverse(String s) {
        Stack<Character> stack = new Stack<>();
        String reverse = "";
        for (int i = 0; i < s.length(); i++)
            stack.push(s.charAt(i));
        while (!stack.isEmpty()) {
            reverse += stack.pop();
        }
        return reverse;
    }

}