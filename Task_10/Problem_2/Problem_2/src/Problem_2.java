import java.util.HashMap;
import java.util.Map;

public class Problem_2 {
    public char notRepeatedCharacter(String s) {
        Map<Character, Integer> first = new HashMap<>();
        for (char c : s.toCharArray()) {
            first.put(c, first.getOrDefault(c, 0) + 1);
        }
        for (char c : s.toCharArray()) {
            if (first.get(c) == 1) {
                return c;
            }
        }
        return '\0';
    }

}
