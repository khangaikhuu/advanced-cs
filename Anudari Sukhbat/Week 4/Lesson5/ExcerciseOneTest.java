

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExcerciseOneTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ExcerciseOneTest
{ 
    @Test 
    public void testMyMethod()
    {
       ExcerciseOne ex1 = new ExcerciseOne();
       assertEquals(0, ex1.getSum());
       ex1.addGlobalSum(1);
       assertEquals(1, ex1.getSum());
       ex1.addGlobalSum(5);
       assertEquals(6, ex1.getSum());
       assertEquals(10, ex1.addLocalSum(5));
   }
}
