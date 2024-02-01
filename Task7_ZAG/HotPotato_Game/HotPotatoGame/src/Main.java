public class Main {
    public static void main(String[] args) {
        HotPotatoGame hotPotato = new HotPotatoGame();

        // Example 1
        String[] namelist1 = {"reda", "zeid", "abdo", "tahoon"};
        int num1 = 1;
        String winner1 = hotPotato.hotPotato(namelist1, num1);
        System.out.println("Example 1 - The winner is: " + winner1);

        // Example 2
        String[] namelist2 = {"Alice", "Bob", "Cathy", "Dave", "Eva"};
        int num2 = 3;
        String winner2 = hotPotato.hotPotato(namelist2, num2);
        System.out.println("Example 2 - The winner is: " + winner2);

        // Example 3
        String[] namelist3 = {"A", "B", "C", "D"};
        int num3 = 3;
        String winner3 = hotPotato.hotPotato(namelist3, num3);
        System.out.println("Example 3 - The winner is: " + winner3);
    }
}
