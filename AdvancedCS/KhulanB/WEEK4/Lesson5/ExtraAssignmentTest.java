

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExtraAssignmentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ExtraAssignmentTest
{
   @Test
   public void testSumArray()
   {
       ExtraAssignment ex0 = new ExtraAssignment();
       int [] arr = {2,4,6,8};
       assertEquals(20, ex0.getSum(arr));
       assertEquals(20, ex0.getSum(arr));
   }
}
