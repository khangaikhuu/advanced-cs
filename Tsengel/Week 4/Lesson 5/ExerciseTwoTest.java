

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExerciseTwoTest.
 *
 * @author  (Tsengel)
 * @version (09.09.2019)
 */
public class ExerciseTwoTest
{
    @Test
    public void testExerciseTwo()
    {
        ExerciseTwo ex2 = new ExerciseTwo();
        assertEquals(30, ex2.getSum());
        assertEquals(40, ex2.getSum());
    }
}
