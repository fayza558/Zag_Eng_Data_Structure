import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        General m = new General();
        System.out.println("The Reverse NUmber is: " + General.reverseNumber(4967));
        System.out.println("The Random Number is: " + General.getRandom(3));
        System.out.println("The Random Number between min and max is : " + General.getRandom(3, 8));
        System.out.println("The Random character is " + General.getRandom('z'));
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"lec1", "lec2", "lec3"};
        System.out.println("The array of integer is:");
        General.printArray(intArray);
        System.out.println("The array of string is:");
        General.printArray(strArray);
    }
}