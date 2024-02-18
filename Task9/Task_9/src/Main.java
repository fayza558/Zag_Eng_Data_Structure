import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int[] freqArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freqArray[hash(s.charAt(i))]++;
        }
        for (int i = 0; i < s.length(); i++) {
            int index = hash(s.charAt(i));
            if (freqArray[i] == 1) {
                System.out.println((char) (i + 97));
            }

        }

    }

    public static int hash(int c) {
        return c - 'a';

    }
}