import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = s.nextInt();
        }
        int[] freqArray = new int[M + 1];
        for (int i = 0; i < N; i++) {
            freqArray[A[i]]++;
        }
        for (int i = 1; i <= M; i++) {
            System.out.println(freqArray[i]);
        }

    }
}