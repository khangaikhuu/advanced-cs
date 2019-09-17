

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
/**
 * The test class SortTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SortTest
{
    @Test
    public void test(){
        Sort s = new Sort();
        int[] array = {1, 4, 2, 6, 3};
        int[] array1 = {1, 2, 3, 4, 6};
        int[] array2 = {6, 4, 3, 2, 1};
        assertEquals(true, Arrays.equals(array1, s.sort(array)));
        assertEquals(true, Arrays.equals(array2, s.sortReverse(array)));
    }
}
