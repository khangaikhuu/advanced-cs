

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExcerciseTwoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ExcerciseTwoTest
{
    @Test 
    public void TestS()
    {
        ExcerciseTwo s = new ExcerciseTwo();
        assertEquals(15, s.getSum());
        assertEquals(16.7,1, s.getDivision());
        assertEquals(3, s.getFormula(2,1,3,4));
        
   
    
    
    }
}
