import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
 Scanner scanner=new Scanner (System.in);
 Method m=new Method();
        System.out.println("The Reverse NUmber is: "+m.reverseNumber(4967));
       System.out.println("The Random Number is: "+m.getRandom(3)) ;
        System.out.println("The Random Number between min and max is : "+m.getRandom(3,8)) ;
      System.out.println("The Random character is "+m.getRandom('z'));
        Integer[] intArray = {1, 2, 3, 4, 5};
        String [] strArray ={"lec1","lec2","lec3"};
        System.out.println("The array of integer is:");
        m.printArray( intArray);
        System.out.println("The array of string is:");
        m.printArray(strArray);
    }
}