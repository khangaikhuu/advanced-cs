

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExtraTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ExtraTest
{
    @Test
    public void testMethods(){
        Extra e = new Extra();
        int[] array = {1, 2, 3, 4, 5};
        double[] array2 = {1.3, 4.2, 9.3, 1.4, 6.5, 1.1, 2.3};
        assertEquals(15, 1, e.sumOfArray(array));
        assertEquals(120, 1, e.productOfArray(array));
        assertEquals(9.3, 1, e.maxValue(array2));
        assertEquals(1.1, 1, e.minValue(array2));
    }
}
