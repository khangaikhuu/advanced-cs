

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
    public void sort()
    {
        Sort s = new Sort();
        int [] array = {2, 4, 1, 3, 5};
        int [] array2 = s.Sort(array);
        assertEquals(true, Arrays.equals(array, array2));
        
    }
    
    
}
