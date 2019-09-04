

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class conditionalsTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class conditionalsTest
{
    conditionals con = new conditionals();
    
    @Test
    public void testChecker()
    {
        assertEquals(false, con.checkMaximum());
        assertEquals("Number one is bigger", con.checkMaxTwoNumber(20, 10));
        assertEquals("Number two is bigger", con.checkMaxTwoNumber(10, 20));
        assertEquals("The numbers are equal to each other", con.checkMaxTwoNumber(20, 20));
        assertEquals("num1 is 10 and num2 is 20", con.numChecker(10,20));
        assertEquals("num1 is 10 and num2 is 5", con.numChecker(10,5));
        assertEquals("num1 is 10 and num2 is 10", con.numChecker(10,10));
    }
    
    
    
}