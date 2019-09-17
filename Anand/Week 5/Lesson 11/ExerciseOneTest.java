

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
/**
 * The test class ExerciseOneTest.
 *
 * @author  (Anand)
 * @version (17.09.19)
 */
public class ExerciseOneTest
{
    @Test
    public void testMyArea()
    {
        ExerciseOne one = new ExerciseOne();
        assertEquals(50.24, 1, one.getArea(4));
        assertEquals(true, one.compareArrays());
    }
}
