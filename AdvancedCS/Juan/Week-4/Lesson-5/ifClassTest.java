

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ifClassTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ifClassTest
{
    @Test
    public void tester()
    {
        ifClass ex = new ifClass();
        assertEquals(30,ex.ifMethod());
    }
}
