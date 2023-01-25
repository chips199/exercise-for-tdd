import java.util.HashMap;
import java.util.Map;

public class Exercise4 {
    public static Map<Character, Integer> CountCharacters(String input) {
        input = input.toUpperCase();
        char[] characters = input.toCharArray();
        Map countedCharacters = new HashMap();

        for (char c: characters) {
            int value = (int) countedCharacters.getOrDefault(c, 0);
            value++;
            countedCharacters.put(c, value);

        }
        return countedCharacters;
    }

    public static void main(String[] args) {
        String word = "Hello World";
        Map countedCharacters = CountCharacters(word);
    }
}
