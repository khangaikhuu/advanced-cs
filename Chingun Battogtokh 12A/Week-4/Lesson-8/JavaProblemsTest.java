

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
      assertEquals(3, c4.getAverage(array));
    }
}
