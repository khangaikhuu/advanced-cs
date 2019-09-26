
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
    public void test(){
        int[] array = {3, 5, 1, 8};
        int[] array1 = {1, 3, 5, 8};
        assertEquals(true, Arrays.equals(BubbleSort.sort(array), array1));
    }
}
