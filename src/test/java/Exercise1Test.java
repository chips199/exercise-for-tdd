import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise1Test {

    @Test
    void sumReturnsZeroForEmptyString() {
        // Given
        String input = "";

        // When
        double result = Exercise1.sum(input);

        // Then
        assertEquals(0, result);
    }
    @Test
    void sumReturnsSumForOneInt() {
        // Given
        String input = "3";

        // When
        double result = Exercise1.sum(input);

        // Then
        assertEquals(3, result);
    }
    @Test
    void sumReturnsSumForOtherInt() {
        // Given
        String input = "5";

        // When
        double result = Exercise1.sum(input);

        // Then
        assertEquals(5, result);
    }

    @Test
    void sumReturnsSumForFloat() {
        // Given
        String input = "5.5";

        // When
        double result = Exercise1.sum(input);

        // Then
        assertEquals(5.5, result);
    }
    @Test
    void sumThrowsExceptionOnInvalidInput() {
        // Given
        String input = "#";

        // When
        assertThrowsExactly(java.lang.NumberFormatException.class, () -> Exercise1.sum(input));
    }
    @Test
    void sumReturnsSumForMultipleFloats() {
        // Given
        String input = "5.5,3.2";

        // When
        double result = Exercise1.sum(input);

        // Then
        assertEquals(8.7, result);
    }
    @Test
    void sumCommaAtEnd() {
        // Given
        String input = "5.5,3.2,";

        // When
        double result = Exercise1.sum(input);

        // Then
        assertEquals(8.7, result);
    }
}