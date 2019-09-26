

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExcerciseOneTest.
 *
 * @author  (Anudari Sukhbat)
 * @version (18/09/19)
 */
public class ExcerciseOneTest
{
   @Test
   public void testBubbleSort()
   {
       int[] unsortedArray = {4, 3, -1, 5};
       int[] sortedArray = {-1, 3, 4, 5};
       assertArrayEquals(sortedArray, ExcerciseOne.bubbleSort(unsortedArray));
       ExcerciseOne c1 = new ExcerciseOne();
       ExcerciseOne b1 = new ExcerciseOne();
       int[] array = {3, 5, 7, 2};
       c1.bubbleSort(array);
    
       b1.swap(array, 1, 0);
       int[] swappedArray = {3, 4, -1, 5};
       //assertArrayEquals(swappedArray, ExcerciseOne.swap(unsortedArray,0,1));
       ExcerciseOne ex1 = new  ExcerciseOne();
       assertEquals(0, ex1.fibonacci(0));
       assertEquals(1, ex1.fibonacci(1));
       assertEquals(1, ex1.fibonacci(2));
       assertEquals(2, ex1.fibonacci(3));
       assertEquals(89, ex1.fibonacci(11));
       
       ExcerciseOne ex2 = new ExcerciseOne();
       assertEquals(1, ex2.powerof10(0));
       
       assertEquals(10, ex2.powerof10(1));
       assertEquals(100, ex2.powerof10(2));
       assertEquals(10000000, ex2.powerof10(7));
       
       
       ExcerciseOne ex3 = new ExcerciseOne();
       assertEquals(19, ex3.sum(10));
       assertEquals(15, ex3.sum(8));
       assertEquals(29, ex3.sum(15));
       assertEquals(59, ex3.sum(30));
       assertEquals(179, ex3.sum(90));
       
       
       
}
}
