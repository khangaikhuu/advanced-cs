

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
        int[] unsortedArray = {4,3,5,2,1};
        int[] sortedArray = {1,2,3,4,5};
        assertArrayEquals(sortedArray, ExerciseOne.bubbleSort(unsortedArray));
        assertEquals(1,1);
        ExerciseOne k1 = new ExerciseOne();
        ExerciseOne k2 = new ExerciseOne();
        int[] array = {1,2,3,4,5};
        k1.bubbleSort(array);
        k2.swap(array, 3,4);
        ExerciseOne ex1 = new ExerciseOne();
        assertEquals(0, ex1.fibonacci(0));
        assertEquals(1, ex1.fibonacci(1));
        assertEquals(1, ex1.fibonacci(2));
        assertEquals(2, ex1.fibonacci(3));
        ExerciseOne ex2 = new ExerciseOne();
        assertEquals(1, ex2.powerOf10(0));
        assertEquals(1, ex2.powerOf10ForLoop(0));
        assertEquals(10, ex2.powerOf10(1));
        assertEquals(100, ex2.powerOf10(2));
        assertEquals(1000, ex2.powerOf10(3));
        assertEquals(10000000, ex2.powerOf10(7));
        assertEquals(10, ex2.powerOf10ForLoop(2));
        assertEquals(100, ex2.powerOf10ForLoop(3));
        ExerciseOne ex3 = new ExerciseOne();
        assertEquals(0, ex3.sum(0));
        assertEquals(3, ex3.sum(2));
        assertEquals(6, ex3.sum(3));
        assertEquals(21, ex3.sum(6));
        assertEquals(10, ex3.sum(4));
        }
}
