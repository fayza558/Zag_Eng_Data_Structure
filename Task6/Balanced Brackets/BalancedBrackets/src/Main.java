import java.beans.Expression;

public class Main {
    public static void main(String[] args) {

        System.out.println(BalancedBrackets.isValid("<>}[)"));
        System.out.println(BalancedBrackets.isValid("<>{}[]()"));
    }
}