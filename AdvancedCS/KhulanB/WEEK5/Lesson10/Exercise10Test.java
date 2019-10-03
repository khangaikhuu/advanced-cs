

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Exercise10Test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Exercise10Test
{
  @Test
  public void testExercise10()
  {
      Exercise10 ex1 = new Exercise10();
      int ar[] = {1,5,4,3,2,9,7,8,10};
      ex1.insertionSort(ar);
    }
}
