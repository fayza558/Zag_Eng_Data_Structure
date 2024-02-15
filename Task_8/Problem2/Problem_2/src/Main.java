import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int[] freqArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freqArray[s.charAt(i) - 'a']++;
        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int cntr = freqArray[ch - 'a'];
            if (cntr > 0) {
                System.out.println(ch + " : " + cntr);
            }
        }
    }
}