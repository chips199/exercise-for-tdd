import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise4Test {
    @Test
    void CountCharacters_hello_World() {
        // Given
        String word = "Hello_World";
        HashMap<Character, Integer> countedCharacters = new HashMap<Character, Integer>();
        countedCharacters.put('_', 1);
        countedCharacters.put('R', 1);
        countedCharacters.put('E', 1);
        countedCharacters.put('D', 1);
        countedCharacters.put('E', 1);
        countedCharacters.put('W', 1);
        countedCharacters.put('H', 1);
        countedCharacters.put('L', 3);
        countedCharacters.put('O', 2);

        // When
        Map result = Exercise4.CountCharacters(word);

        // Then
        assertEquals(countedCharacters, result);
    }
}
