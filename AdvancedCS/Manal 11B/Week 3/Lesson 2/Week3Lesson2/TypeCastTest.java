

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TypeCastTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TypeCastTest
{
    @Test
    public void testGetA(){
        TypeCast tc = new TypeCast();
        assertEquals(10, tc.getA());
        tc.convert(20);
        assertEquals(20.0, 1, tc.getB());
        assertEquals(5.0, 1, tc.convertAdd(2, 3));
    }
}
