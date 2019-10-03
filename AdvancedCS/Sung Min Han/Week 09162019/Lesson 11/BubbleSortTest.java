import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BubbleSortTest.
 *
 * @author  (Sung Min)
 * @version (9172019)
 */
public class BubbleSortTest
{
    @Test
    public void testBubbleSort()
    {
        int[] unsortedArray = {4, 3, -1, 5};
        int[] sortedArray = {-1, 3, 4, 5};
        assertArrayEquals(unsortedArray, BubbleSort.bubbleSort(unsortedArray));
        assertEquals(1, 1);
            
        int[] swappedArray = {3, 4, -1, 5};
        assertArrayEquals(swappedArray, BubbleSort.swap(unsortedArray, 0, 1));
    }
}
