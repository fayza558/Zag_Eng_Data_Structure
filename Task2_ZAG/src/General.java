public class General {

    public static int reverseNumber(int num) {
        int reverse = 0;
        while (num > 0) {

            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num /= 10;

        }

        return reverse;
    }

    public static int getRandom(int random) {

        return (int) (Math.random() * random + 1);
    }

    public static int getRandom(int min, int max) {
        return (int) ((min + (max - min) * Math.random()));
    }

    public static char getRandom() {

        int randomAsciiValue = (int) (Math.random() * ('Z' - 'A') + 'A');
        return (char) randomAsciiValue;
    }

    public static <T> void printArray(T[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

}
