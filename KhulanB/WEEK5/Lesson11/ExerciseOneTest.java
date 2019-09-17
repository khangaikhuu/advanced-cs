

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
/**
 * The test class ExerciseOneTest.
 *
 * @author  (Khulan)
 * @version (09.17.19)
 */
public class ExerciseOneTest
{
    @Test
    public void testMyArea()
    {
       ExerciseOne ex1 = new ExerciseOne();
       assertEquals(true, ex1.compareArray());
        assertEquals(50.24, 1, ExerciseOne.getArea(4));
    }
}
