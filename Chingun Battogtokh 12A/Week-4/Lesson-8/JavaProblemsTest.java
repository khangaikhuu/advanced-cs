

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class JavaProblemsTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class JavaProblemsTest
{
  @Test 
  public void test() 
  { 
      JavaProblems c4 = new JavaProblems(); 
      int[] array = {1, 2, 3, 4, 5};
      int[] array1 = {7, 2, 8, 4, 1}; 
      int[] array3 = {1, 2, 2, 4, 5};
      assertEquals(3, c4.getAverage(array));
      assertEquals(true, c4.value(array, 3)); 
      assertEquals(0, c4.index(array, 1)); 
      assertEquals(2, c4.secondLargest(array)); 
      assertEquals(2, c4.duplicate(array3));
      
    }
}
