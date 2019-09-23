
import java.util.Arrays;
import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExerciseOneTest.
 *
 * @author  (Erkhem)
 * @version (9/18/2019)
 */
public class ExerciseOneTest
{
    @Test
    public void testExerciseOne()
    {
        int[] unsorted =  {5,4,3,2,1};
        int[] sorted = {1,2,3,4,5};
        assertArrayEquals(sorted, ExerciseOne.bubbleSort(unsorted));
        assertEquals(15 ,ExerciseOne.sum(5));
        assertEquals(55 , ExerciseOne.fibonnaci(10));
        assertEquals(75025, ExerciseOne.fibonnaci(25));
    }
}
