
import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BubbleSortTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BubbleSortTest
{
    @Test 
    public void test() 
    { 
        int[] arrayOne = {-5, 4, 1, 0, 12, 13};
        int[] arrayTwo = {-5, 0, 1, 4, 12, 13};
        assertEquals(true, Arrays.equals(BubbleSort.sort(arrayOne),arrayTwo));
}
}
