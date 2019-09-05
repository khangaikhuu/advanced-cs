

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class typeConversionTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class typeConversionTest
{
    @Test
    public void testGetA()
    {
    typeConversion tc = new typeConversion();
    assertEquals(10, tc.getA());
    tc.convertA(20);
    assertEquals(20.0, 1, tc.getB());
    assertEquals(12.0, 1, tc.convertTwoNumbers(10, 2));
    }
}
