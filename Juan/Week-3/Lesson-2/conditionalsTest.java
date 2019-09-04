

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
    }
    
}