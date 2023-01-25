import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise3Test {

    @Test
    void metrik_0() {
        // Given
        int[] vector_1 = {1,1};
        int[] vector_2 = {1,1};

        int result = Exercise3.manhattan_distance(vector_1, vector_2);
        assertEquals(0, result);
    }

    @Test
    void metrik_2() {
        // Given
        int[] vector_1 = {5,4};
        int[] vector_2 = {3,2};

        int result = Exercise3.manhattan_distance(vector_1, vector_2);
        assertEquals(4, result);
    }

    @Test
    void metrik_3() {
        // Given
        int[] vector_1 = {1,1};
        int[] vector_2 = {0,3};

        int result = Exercise3.manhattan_distance(vector_1, vector_2);
        assertEquals(3, result);
    }

    @Test
    void metrik_4() {
        // Given
        int[] vector_1 = {1,1};
        int[] vector_2 = {0,-3};

        int result = Exercise3.manhattan_distance(vector_1, vector_2);
        assertEquals(5, result);
    }
}