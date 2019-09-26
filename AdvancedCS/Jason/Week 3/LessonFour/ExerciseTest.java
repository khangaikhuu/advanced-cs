

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExerciseTest.
 *
 * @author  (Jason)
 * @version (06.09.2019)
 */
public class ExerciseTest
{
    @Test 
    public void testmyIntegerArray()
    {
         int [] myIntegerArray = {1, 4, 3, 4, 5, 6, 8, 10};
         Exercise jason = new Exercise ();
         assertEquals (41, jason.calculateMySum(myIntegerArray));
    }
}
