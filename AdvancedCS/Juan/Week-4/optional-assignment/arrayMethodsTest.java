

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class arrayMethodsTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class arrayMethodsTest
{
    @Test
    public void tester()
    {
    int[] intSumProduct={1,2,3};
    double[] doubleMaxMin = {1.0,2.0,3.0};
        arrayMethods ex = new arrayMethods();
        assertEquals(6,ex.intSum(intSumProduct));
        assertEquals(6,ex.intProduct(intSumProduct));
        assertEquals(3.0,1,ex.doubleMax(doubleMaxMin));
        assertEquals(1.0,1,ex.doubleMin(doubleMaxMin));
    }
}
