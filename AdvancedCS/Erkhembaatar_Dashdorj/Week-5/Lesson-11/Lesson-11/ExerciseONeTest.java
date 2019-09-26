import java.util.Arrays;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExerciseONeTest.
 *
 * @author  (Erkhem)
 * @version (9/17/2019)
 */
public class ExerciseONeTest
{
    @Test
    public void testExercise()
    {
        ExerciseONe e1 = new ExerciseONe();
        int[] a = {1,2,3,4,5};
        int[] b = {5,4,3,2,1};
        assertEquals(true , Arrays.equals(a,e1.bubbleSort(b)));
    }
}
