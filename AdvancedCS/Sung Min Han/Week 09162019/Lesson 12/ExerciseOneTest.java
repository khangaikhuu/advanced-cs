import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExerciseOneTest.
 *
 * @author  (Sung Min)
 * @version (9182019)
 */
public class ExerciseOneTest
{
    @Test
    public void testBubbleSort()
    {
        int[] unsortedArray = {4, 3, -1, 5};
        int[] sortedArray = {-1, 3, 4, 5};
        assertArrayEquals(unsortedArray, ExerciseOne.bubbleSort(unsortedArray));
        assertEquals(1, 1);
        ExerciseOne e1 = new ExerciseOne();
        assertEquals(0, e1.fibonacci(0));
        assertEquals(1, e1.fibonacci(1));
        assertEquals(1, e1.fibonacci(1));
        assertEquals(2, e1.fibonacci(3));
        assertEquals(34, e1.fibonacci(9));
        
        ExerciseOne e2 = new ExerciseOne();
        assertEquals(1, e2.powerOf10(0));
        assertEquals(1, e2.powerOf10ForLoop(0));
        
        assertEquals(10, e2.powerOf10(1));
        assertEquals(1, e2.powerOf10ForLoop(1));
        // 2 *
        assertEquals(100, e2.powerOf10(2));
        assertEquals(10, e2.powerOf10ForLoop(2));
        
        assertEquals(1000, e2.powerOf10(3));
        assertEquals(10000000, e2.powerOf10(7));
        
        ExerciseOne eo = new ExerciseOne();
        assertEquals(1, eo.sum(1));
        assertEquals(3, eo.sum(2));
        assertEquals(6, eo.sum(3));
        assertEquals(10, eo.sum(4));
        assertEquals(15, eo.sum(5));
    }
}
