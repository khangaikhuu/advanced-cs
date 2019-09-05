

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ConditionalsTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ConditionalsTest
{
    @Test
    public void testCheckMax(){
        Conditionals c = new Conditionals();
        assertEquals(false, c.checkMax());
        assertEquals("They are Equal", c.checkMaxNumbers(2, 2));
        assertEquals("Num1 is bigger", c.checkMaxNumbers(3, 2));
        assertEquals("Num2 is bigger", c.checkMaxNumbers(1, 2));
    }
}
