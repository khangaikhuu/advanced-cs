

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExerciseOneTest.
 *
 * @author  (Erkhem)
 * @version (9/9/19)
 */
public class ExerciseOneTest
{
   @Test
   public void testMethodSum()
   {
       ExerciseOne ex1 = new ExerciseOne();
       assertEquals(0, ex1.getSum());
       ex1.addGlobalSum(1);
       assertEquals(1 , ex1.getSum());
       ex1.addGlobalSum(5);
       assertEquals(6, ex1.getSum());
       assertEquals(10, ex1.addLocalSum(5));
    }
}
