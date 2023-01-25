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
    void testReturns1On1() {
        // Given
        String input = "1";

        // When
        double result = Exercise1.sum(input);

        // Then
        assertEquals(1, result);
    }
    @Test
    void testReturns2On2() {
        // Given
        String input = "2";

        // When
        double result = Exercise1.sum(input);

        // Then
        assertEquals(2, result);
    }

    @Test
    void testReturnFloatingPoint() {
        // Given
        String input = "2.1";

        // When
        double result = Exercise1.sum(input);

        // Then
        assertEquals(2.1, result);
    }

    @Test
    void testUnknownInput() {
        // Given
        String input = "#";

        // When
        assertThrowsExactly(java.lang.NumberFormatException.class, () -> Exercise1.sum(input));
    }

    @Test
    void testTwoInts() {
        // Given
        String input = "1,2";

        // When
        double result = Exercise1.sum(input);

        // Then
        assertEquals(3, result);
    }

    @Test
    void testTwoDouble() {
        // Given
        String input = "1.0,2.5";

        // When
        double result = Exercise1.sum(input);

        // Then
        assertEquals(3.5, result);
    }

    @Test
    void testInvalidInputWithMultiple() {
        // Given
        String input = "#,2.5";

        // When
        assertThrowsExactly(java.lang.NumberFormatException.class, () -> Exercise1.sum(input));
    }

    @Test
    void testEndingWithComma() {
        // Given
        String input = "1.0,2.5,";

        // When
        double result = Exercise1.sum(input);

        // Then
        assertEquals(3.5, result);
    }
}