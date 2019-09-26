

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DrawIOTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DrawIOTest
{
    @Test
    public void test(){
        DrawIO io = new DrawIO();
        io.checkValue();
        assertEquals("World Hello", io.getA());
    }
}
