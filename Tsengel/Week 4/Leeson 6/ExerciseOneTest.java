import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExerciseOneTest.
 *
 * @author  (Tsengel)
 * @version (10.09.2019)
 */
public class ExerciseOneTest
{
    @Test
    public void testExerciseOne()
    {
        ExerciseOne e1 = new ExerciseOne();
        e1.changeA();
        assertEquals("World Hello", e1.getA());
        e1.conditionals();
    }
}
