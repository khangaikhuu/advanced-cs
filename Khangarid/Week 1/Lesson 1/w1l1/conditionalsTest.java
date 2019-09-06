import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class conditionalsTest
{
    @Test
    public void testCheckConditionals()
    {
        conditionals c = new conditionals();
        assertEquals(false, c.checkMaximum());
        assertEquals("The number two is bigger", c.checkMaximumTwoNumbers(10, 20));
        assertEquals("The number one is bigger", c.checkMaximumTwoNumbers(10, 5));
        assertEquals("The numbers are equal", c.checkMaximumTwoNumbers(10, 10));
    }
}
