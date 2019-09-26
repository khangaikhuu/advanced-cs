

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
    public void testCheckConditionals()
    {
        Conditionals c = new Conditionals();
        assertEquals(false, c.checkMaximum());
        assertEquals("The number one is bigger", c.checkMaximumTwoNumbers(10, 5));
        assertEquals("The number two is bigger", c.checkMaximumTwoNumbers(10, 20));
        assertEquals("The numbers are equal", c.checkMaximumTwoNumbers(10,10));
    }
        
}
