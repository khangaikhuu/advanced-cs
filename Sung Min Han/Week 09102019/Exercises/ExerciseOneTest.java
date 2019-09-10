import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExerciseOneTest.
 *
 * @author  (Sung Min)
 * @version (102019)
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
