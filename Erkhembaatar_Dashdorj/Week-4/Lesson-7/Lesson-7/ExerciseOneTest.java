

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExerciseOneTest.
 *
 * @author  (Erkhem)
 * @version (1.0)
 */
public class ExerciseOneTest
{
    @Test
    public void testExerciseOne()
    {
        ExerciseOne e1 = new ExerciseOne();
        assertEquals("Negative",e1.trueOrFalse(-25));
        assertEquals(35, e1.greatestThreeNum(35,20,10));
        assertEquals("Positive large", e1.floatNumber(1000000000));
        assertEquals("Sunday", e1.weekday(7));
    }
}
