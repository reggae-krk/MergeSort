import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    private int[] createArrayToSort() {
        int[] array = new int[50];
        int randomNumber;
        for (int i = 0; i < array.length; i++) {
            randomNumber = new Random().nextInt(500);
            array[i] = randomNumber;
        }
        return array;
    }

    @Test
    void testMergeSort() {
        int[] array = createArrayToSort();
        int[] sortedArray = array.clone();

        Arrays.sort(sortedArray);
        MergeSort.sort(array);

        assertEquals(Arrays.toString(sortedArray), Arrays.toString(array));
    }

}