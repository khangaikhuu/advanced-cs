

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
        assertEquals("The number two is bigger", c.checkMaximumTwoNumbers(2, 3));
        assertEquals("The number one is bigger", c.checkMaximumTwoNumbers(3, 2)); 
        assertEquals("The numbers are equal", c.checkMaximumTwoNumbers(5, 5)); 
        
        
    } 
    
}
