

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class lesson1Test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class lesson1Test
{
    @Test
    public void test()
    {
        lesson1 ex = new lesson1();
        assertEquals(50.24,1, lesson1.getArea(4));
        assertEquals(true, ex.compareArrays());
    }
}
