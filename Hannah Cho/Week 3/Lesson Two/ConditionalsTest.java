

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
     public void testConditionals()
    {
        Conditionals c1 = new Conditionals();
        assertEquals(false, c1.checkMax());
        
        assertEquals("Number one is bigger", c1.checkMaximumTwoNumbers(10,5));
        assertEquals("Number two is bigger", c1.checkMaximumTwoNumbers(10,20));
        assertEquals("The Numbers are equal", c1.checkMaximumTwoNumbers(10,10));
    }
}
