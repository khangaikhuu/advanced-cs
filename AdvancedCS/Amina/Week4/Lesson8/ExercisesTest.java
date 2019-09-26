

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExercisesTest.
 *
 * @author  (Amina)
 * @version (12.09.2019)
 */
public class ExercisesTest
{
    @Test 
    public void testExercises()
    {
        Exercises ex1 = new Exercises();
        ex1.sumAverage();
        ex1.specificValue();
        
    }
}
