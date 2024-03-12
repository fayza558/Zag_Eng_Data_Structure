import java.util.HashMap;
import java.util.Map;

public class Problem_3 {
    //TimeComplexity O(n)
    public int mostRepeatedElement(int[] nums) {
        Map<Integer, Integer> element = new HashMap<>();
        for (int num : nums) {
            element.put(num, element.getOrDefault(num, 0) + 1);
        }
        int mostRepeatedElement = nums[0];
        int maxCount = 0;
        for (int num : nums) {
            if (element.get(num) > maxCount) {
                maxCount = element.get(num);
                mostRepeatedElement = num;
            }

        }
        return mostRepeatedElement;

    }
}
