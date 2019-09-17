

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * The test class ExerciseOneTest.
 *
 * @author  (AMina)
 * @version (17.09.2019)
 */
public class ExerciseOneTest
{
     @Test
    public void testMyArea()
    {
        ExerciseOne one = new ExerciseOne();
        assertEquals(50.24, 1, ExerciseOne.getArea(4));
        assertEquals(true, one.compareArrays());
    }
}
