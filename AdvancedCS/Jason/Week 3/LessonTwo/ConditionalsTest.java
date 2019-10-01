

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
    public void testCheckConditional()
    {
        Conditionals c = new Conditionals();
        assertEquals(false, c.checkMaximum());
        assertEquals("The Number one is bigger", c.checkMaximumTwoNumbers(20,5));
        assertEquals("The Number two is bigger", c.checkMaximumTwoNumbers(1,10));
        assertEquals("The Numbers are equal", c.checkMaximumTwoNumbers(5,5));
    }
}
