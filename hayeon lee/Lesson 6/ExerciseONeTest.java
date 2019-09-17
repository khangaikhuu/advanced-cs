

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExerciseONeTest.
 *
 * @author  (Hayeon lee)
 * @version (a version number or a date)
 */
public class ExerciseONeTest
{
    @Test
    public void testA()
    {
        ExerciseONe one = new ExerciseONe();
        one.changeA();
        assertEquals("Hello World", one.getA());
        one.conditionals();
    }
}
