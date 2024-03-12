import java.util.HashMap;
import java.util.Map;

public class Problem_1 {
    public void countOccurrences(String s) {
        Map<Character, Integer> occurrences = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (occurrences.containsKey(c)) {
                occurrences.put(c, occurrences.get(c) + 1);
            } else {
                occurrences.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
            System.out.println("Character    " + entry.getKey() + "    Occurrences    " + entry.getValue());
        }
    }

}
