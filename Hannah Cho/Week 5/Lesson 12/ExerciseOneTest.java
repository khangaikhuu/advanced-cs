

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExerciseOneTest.
 *
 * @author  (Hannah)
 * @version (18.09.2019)
 */
public class ExerciseOneTest
{
     @Test
    public void testBubbleSort()
    {
        int[] unsortedArray = {4,3,-1,5};
        int[] sortedArray = {-1,3,4,5};
        assertArrayEquals(sortedArray, ExerciseOne.bubbleSort(unsortedArray));
        assertEquals(1,1);
        int[] swappedArray = {3,4,-1,5};
        assertArrayEquals(swappedArray, ExerciseOne.swap(unsortedArray, 0,1));
        
        ExerciseOne e1 = new ExerciseOne();
        ExerciseOne e2 = new ExerciseOne();
        int [] array = {1,5,8,1};
        e1.bubbleSort(array);
        e2.swap(array, 1,0);
    }
}
