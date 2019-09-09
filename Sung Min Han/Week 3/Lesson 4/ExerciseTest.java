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
    public void sungMinExerciseTest()
    {
        int [] sungMinIntArray = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Exercise ex = new Exercise();
        assertEquals(54, ex.calculateMySum(sungMinIntArray)); 
    }
}
