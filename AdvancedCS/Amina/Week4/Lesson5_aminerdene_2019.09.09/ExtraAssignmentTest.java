

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExtraAssignmentTest.
 *
 * @author  (Amina)
 * @version (2019,09,09)
 */
public class ExtraAssignmentTest
{
  @Test
  public void getSumArray()
  {
      ExtraAssignment ex1 = new ExtraAssignment();
      int [] arr = {1,3,5};
      assertEquals(9, ex1.getSum(arr));
    }
  
}
