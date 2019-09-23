

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
    public void testBubbleSort()
    {
        int[] unsortedArray = {4, 3, -1, 5};
        int[] sortedArray = {-1, 3, 4, 5};
        assertArrayEquals(sortedArray, ExerciseOne.bubbleSort(unsortedArray));
        assertEquals(1,1);
        
        ExerciseOne ex1 = new ExerciseOne();
        assertEquals(0, ex1.fibonacci(0));
        assertEquals(1, ex1.fibonacci(1));
        assertEquals(1, ex1.fibonacci(2));
        assertEquals(2, ex1.fibonacci(3));
        assertEquals(3, ex1.fibonacci(4));
        assertEquals(34, ex1.fibonacci(9));
        
        ExerciseOne ex2 = new ExerciseOne();
        
        assertEquals(1, ex2.powerOf10(0));
        assertEquals(1, ex2.powerOf10ForLoop(0));
        
        assertEquals(10, ex2.powerOf10(1));
        assertEquals(10, ex2.powerOf10ForLoop(1));
        
        assertEquals(100, ex2.powerOf10(2));
        assertEquals(100, ex2.powerOf10ForLoop(2));
        
        assertEquals(1000, ex2.powerOf10(3));
        assertEquals(1000, ex2.powerOf10ForLoop(3));
        
        assertEquals(10000000, ex2.powerOf10(7));
        assertEquals(10000000, ex2.powerOf10ForLoop(7));
        
        ExerciseOne ex3 = new ExerciseOne();
        
        assertEquals(1, ex3.sum(1));
        assertEquals(3, ex3.sum(2));
        assertEquals(6, ex3.sum(3));
        assertEquals(10, ex3.sum(4));
        assertEquals(15, ex3.sum(5));
    }
}
