

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TypeConversionTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TypeConversionTest
{
    @Test
    public void testGetA()
    {   
        TypeConversion tc1 = new TypeConversion();
        assertEquals(10, tc1.getA());
        tc1.convertB(20);
        assertEquals(20.0, 1, tc1.getB());
        assertEquals(20.0, 1 , tc1.getTwoIntegers(10,20));
    }

        

}
