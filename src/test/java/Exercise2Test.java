import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise2Test {

    @Test
    void leapYear() {
        // Given
        int year = 2004;

        // When
        boolean result = Exercise2.leap_years(year);

        // Then
        assertTrue(result);
    }

    @Test
    void leapYear_hundred() {
        // Given
        int year = 2100;

        // When
        boolean result = Exercise2.leap_years(year);

        // Then
        assertFalse(result);
    }

    @Test
    void noleapYear() {
        // Given
        int year = 2006;

        // When
        boolean result = Exercise2.leap_years(year);

        // Then
        assertFalse(result);
    }

    @Test
    void leapYear_four_hundred() {
        // Given
        int year = 2000;

        // When
        boolean result = Exercise2.leap_years(year);

        // Then
        assertTrue(result);
    }

}