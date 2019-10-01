

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ConditionalsTest.
 *
 * @author  (Khulan)
 * @version (04.09.2019)
 */
public class ConditionalsTest
{
    @Test
    public void testCheckConditionals()
    {
        Conditionals c = new Conditionals();
        assertEquals(false, c.checkMaximum());
        assertEquals("The number one is bigger", c.checkMaximumTwoNumbers(20,10));
        assertEquals("The number two is bigger", c.checkMaximumTwoNumbers(5, 10));
        assertEquals("The numbers are equal", c.checkMaximumTwoNumbers(10,10));
    }
}
