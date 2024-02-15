import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int[] freqArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freqArray[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < freqArray.length; i++) {
            if (freqArray[i] != 0) {
                for (int j = 0; j < freqArray[i]; j++) {
                    System.out.print((char) (i + 'a'));
                }
            }
        }


    }
}