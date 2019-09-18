

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
/**
 * The test class BubbleSortTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BubbleSortTest
{
    @Test
    public void testBubbleSort()
    {
        BubbleSort obj1 = new BubbleSort();
        int [] anand = {3, 2, 5, 4};
        int [] sortedArray = {2, 3, 4, 5};
        assertEquals(true, Arrays.equals(sortedArray, obj1.sort(anand)));
        
        
    }
}
