public class Main {
    public static void main(String[] args) {
        Problem_3 problem = new Problem_3();
        int[] nums = {1, 2, 2, 3, 3, 3, 4};
        int mostRepeated = problem.mostRepeatedElement(nums);

        System.out.println("Most repeated element: " + mostRepeated);

    }
}