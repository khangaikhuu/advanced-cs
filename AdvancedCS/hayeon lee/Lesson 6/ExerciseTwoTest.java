

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExerciseTwoTest.
 *
 * @author  (Hayeon Lee)
 * @version (10/09/2019)
 */
public class ExerciseTwoTest
{
    @Test
    public void testS()
    {
        ExerciseTwo two = new ExerciseTwo();
        assertEquals("Hello Mr.Khangai", two.main());
        assertEquals(15, two.getSum());
        assertEquals(16,two.getDivision());
        
        
    }
}
