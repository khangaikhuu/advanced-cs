

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExerciseTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ExerciseTest
{
    @Test
    public void testExercise()
    {
        Exercise e1 = new Exercise();
        assertEquals(12172, e1.calculateArry());
    }
    
}
