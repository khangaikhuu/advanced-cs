

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExerciseOneTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ExerciseOneTest
{
    @Test
    public void testExerciseoOne()
    {
        ExerciseOne e1 = new ExerciseOne();
        e1.changeA();
        assertEquals("World Hello", e1.getA());
        assertEquals(5.0,1, e1.printC());
    }
}
