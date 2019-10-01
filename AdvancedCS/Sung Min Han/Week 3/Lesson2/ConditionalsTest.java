import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ConditionalsTest.
 *
 * @author  (Sung Min)
 * @version (042019)
 */
public class ConditionalsTest
{
    @Test
    public void tesetCheckConditionals()
    {
        Conditionals c = new Conditionals();
        assertEquals(false, c.checkMaximum());
        assertEquals("Number two is bigger", c.checkMaximumTwoNumbers(10, 20));
        assertEquals("Number one is bigger", c.checkMaximumTwoNumbers(10, 5));
        assertEquals("The Numbers are equal", c.checkMaximumTwoNumbers(10,10));
    }
}
