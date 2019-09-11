

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
    public void testA()
    {
        ExerciseOne one = new ExerciseOne();
        one.changeA();
        assertEquals("World Hello", one.getA());
        one.conditionals();
    }
}
