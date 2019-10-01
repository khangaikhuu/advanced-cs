

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
/**
 * The test class HomeworkTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class HomeworkTest
{
   @Test
   public void testHomework()
   {
       Homework h1 = new Homework();
       int[] array = {1,3,2,5};
       int[] sortedArray = {1,2,3,5};
       assertEquals(true,Arrays.equals(sortedArray, h1.bubbleSort(array, array.length)));
    }
}
