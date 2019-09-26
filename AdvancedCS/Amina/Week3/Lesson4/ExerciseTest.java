

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExerciseTest.
 *
 * @author  (Amina)
 * @version (09.06.2019)
 */
public class ExerciseTest
{
    @Test 
    public void testMyIntegerArray()
    {
        Exercise myObj = new Exercise();
        assertEquals (31, myObj.calculateMySum());
    }
}
