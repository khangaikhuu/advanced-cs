

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class probBasicsTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class probBasicsTest
{
    @Test
    public void tester()
    {
        probBasics ex = new probBasics();
        assertEquals("Hello Juan", ex.concat(" Juan"));
        assertEquals(15, ex.adder(10,5));
        assertEquals(16,ex.divider(50,3));
        assertEquals(56, ex.formula(7,9,5,8));
        ex.table(9);
        assertEquals(20.0,1,ex.average(10.0,20.0,30.0));
        ex.swap(10,20);
        ex.face();
        int[] a = {1,5,6,7};
        ex.intArray(a);
        assertEquals(4,ex.maximum(a));
    }
}
