

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExerciseOneTest.
 *
 * @author  (Jason)
 * @version (18.09.2019)
 */
public class ExerciseOneTest
{
    @Test
    public void testBubbleSort()
    {
        int[] unsortedArray = { 4, 5, 2, -4, -2};
        int[] sortedArray = {-4, -2, 2, 4, 5};
        assertArrayEquals(unsortedArray, ExerciseOne.bubbleSort(unsortedArray));
        assertEquals(1,1);
        ExerciseOne ex1 = new ExerciseOne();
        assertEquals(0, ex1. fibonacci(0));
        assertEquals(1, ex1. fibonacci(1));
        assertEquals(1, ex1. fibonacci(2));
        assertEquals(2, ex1. fibonacci(3));
        assertEquals(34, ex1. fibonacci(9));
        
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
        assertEquals(28, ex3.sum(7));
        assertEquals(3, ex3.sum(2));
        assertEquals(15, ex3.sum(5));
        assertEquals(36, ex3.sum(8));
        assertEquals(55, ex3.sum(10));
    }
}