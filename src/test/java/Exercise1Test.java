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

    @Test
    void sumReturns1WhenInputIs1() {
        // Given
        String input = "1";

        // When
        int result = Exercise1.sum(input);

        // Then
        assertEquals(1, result);
    }

    @Test
    void sumReturns3WhenInputIs3() {
        // Given
        String input = "3";

        // When
        int result = Exercise1.sum(input);

        // Then
        assertEquals(3, result);
    }

    @Test
    void sumReturnsSumOfTwoValues() {
        // Given
        String input = "3,1";

        // When
        int result = Exercise1.sum(input);

        // Then
        assertEquals(4, result);
    }

    @Test
    void sumReturnsSumOfThreeValues() {
        // Given
        String input = "3,1,2";

        // When
        int result = Exercise1.sum(input);

        // Then
        assertEquals(6, result);
    }
}