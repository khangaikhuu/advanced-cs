

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExerciseTwoTest.
 *
 * @author  (Erkhem)
 * @version (9/9/19)
 */
public class ExerciseTwoTest
{
    @Test
    public void testExerciseTwo()
    
    {
        ExerciseTwo e1 = new ExerciseTwo();
        e1.changeInt();
        assertEquals(30, e1.returnInt());
    }
    
}
