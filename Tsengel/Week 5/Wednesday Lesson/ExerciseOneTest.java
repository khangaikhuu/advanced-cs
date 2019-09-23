import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExerciseOneTest.
 *
 * @author  (Tsengel)
 * @version (18.09.2019)
 */
public class ExerciseOneTest
{
   @Test
   public void testBubbleSort()
   {
       int[] unsortedArray = {4,3,-1,5};
       int[] sortedArray = {-1,3,4,5};
       assertArrayEquals(unsortedArray, ExerciseOne.bubbleSort(unsortedArray));
       assertEquals(1,1);
       
       ExerciseOne ex1 = new ExerciseOne();
       assertEquals(0, ex1.fibonacci(0));
       assertEquals(1, ex1.fibonacci(1));
       assertEquals(1, ex1.fibonacci(2));
       assertEquals(2, ex1.fibonacci(3));
       assertEquals(34, ex1.fibonacci(9));
       
       ExerciseOne ex2 = new ExerciseOne();
       assertEquals(1, ex2.powerOf10(0));
       assertEquals(1, ex2.powerOf10ForLoop(0));
       assertEquals(100, ex2.powerOf10(2));
       assertEquals(1000, ex2.powerOf10(3));
       assertEquals(1000000, ex2.powerOf10(6));
       
       ExerciseOne ex3 = new ExerciseOne();
       assertEquals(3, ex3.sum(2));
       assertEquals(6, ex3.sum(3));
       assertEquals(10, ex3.sum(4));
       assertEquals(15, ex3.sum(5));
       assertEquals(21, ex3.sum(6));
    }
}
