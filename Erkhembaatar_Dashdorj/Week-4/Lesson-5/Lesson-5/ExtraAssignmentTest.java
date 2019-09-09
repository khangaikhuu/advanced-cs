

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExtraAssignmentTest.
 *
 * @author  (Erkhem)
 * @version (9/9/19)
 */
public class ExtraAssignmentTest
{
   @Test
   public void testExtra()
   {
       ExtraAssignment e1 = new ExtraAssignment();
       int[] t1= {5,5,10,10};
       int[] t2 = {3,4,5,1};
       double[] t3 = {5.0,10.0,50.0,25.0};
       assertEquals(30 , e1.sumOfArry(t1));
       assertEquals(60 , e1.productOfArry(t2));
       assertEquals(50.0,1,  e1.maxOfArry(t3));
       assertEquals(5.0,1, e1.minOfArry(t3));
   }
}
