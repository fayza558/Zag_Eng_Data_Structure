public class Method {
 /* public int reverseNumber(int num)
    {
        int reverse =0;
        while(num>0)
        {
            reverse =0;
           int lastDigit =num%10;
           reverse =reverse *10+lastDigit;

        }

        return reverse;
    }*/

    public int reverseNumber(int num) {

        String numStr = Integer.toString(num);
        StringBuilder reversedStr = new StringBuilder(numStr).reverse();


        int reversedNum = Integer.parseInt(reversedStr.toString());

        return reversedNum;
    }


    public  int getRandom(int random )
    {
       return (int)(Math.random()*random);
    }
    public  int getRandom(int min,int max)
    {
        return (int)((min+(max-min)*Math.random()));
    }
    public char getRandom(char character) {

        int randomAsciiValue = (int) (Math.random() * (character + 1));
        return (char) randomAsciiValue;
    }
    public   <T> void printArray(T [] arr)
    {

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

}
