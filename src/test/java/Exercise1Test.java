import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise1Test {

    @Test
    void sumReturnsZeroForEmptyString() {
        // Given
        String input = "";

        // When
        int result = Exercise1.sum(input);

        // Then
        assertEquals(0, result);
    }
}