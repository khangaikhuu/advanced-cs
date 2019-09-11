

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class problem1Test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class problem1Test
{
    @Test
    public void tester()
    {
        problem1 ex = new problem1();
        ex.changeA();
        assertEquals("Hello World",ex.getA());
        ex.conditional();
    }
}
