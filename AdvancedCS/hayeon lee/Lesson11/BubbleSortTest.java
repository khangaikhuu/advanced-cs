

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

/**
 * The test class BubbleSortTest.
 *
 * @author  (Hayeon Lee)
 * @version (17/09/2019)
 */
public class BubbleSortTest
{
    @Test
    public void testSort()
    {
        BubbleSort sort = new BubbleSort();
        int [] a = {3,4,7,1};
        int [] sortedArray = {1,3,4,7};
        assertEquals(true,Arrays.equals(sortedArray, sort.sortBubble(a)));
    }
}
