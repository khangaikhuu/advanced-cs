

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExerciseOneTest.
 *
 * @author  (Bilguundalai)
 * @version (10/09/2019)
 */
public class ExerciseOneTest
{
    @Test
    public void testA()
    {
        ExerciseOne one = new ExerciseOne();
        one.changeA();
        assertEquals("Hello World", one.getA());
        one.conditionals();
    }
}
