import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExercisesTest.
 *
 * @author  (Tsengel)
 * @version (12.09.2019)
 */
public class ExercisesTest
{
    @Test
    public void testMyExercises()
    {
        Exercises ex1 = new Exercises();
        ex1.getAverage();
        ex1.getValue();
        assertEquals(10, ex1.getMax());
    }
}
