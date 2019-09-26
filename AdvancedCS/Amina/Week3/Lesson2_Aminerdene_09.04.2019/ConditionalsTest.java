

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ConditionalsTest.
 *
 * @author  (Amina)
 * @version (09.04.2019)
 */
public class ConditionalsTest
{
    @Test
    public void testCheckConditionals()
    {
        Conditionals c = new Conditionals();
        assertEquals(false, c.checkMaximum());
        assertEquals("The Number two is bigger", c.checkMaximumTwoNymbers(10,20));
        assertEquals("The Number one is bigger", c.checkMaximumTwoNymbers(10, 5));
        assertEquals("The Numbers are equal", c.checkMaximumTwoNymbers(10,10));
    }
}
