

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class type_conversionTest

{
    @Test
    public void testGetA()
    {
        type_conversion tc = new type_conversion();
        assertEquals(10, tc.getA());
        tc.convertA(20);
    }
    @Test
    public void testCast()
    {
        type_conversion tc = new type_conversion();
        tc.convertA(20);
        assertEquals(20.0, 1, tc.getB());
        tc.sumNums(5,20);
        assertEquals(20.0,1, tc.getB());
        assertEquals(20.0, 1, tc.sumNums(5,15));
    }
}