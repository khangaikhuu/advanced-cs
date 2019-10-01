

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExerciseTwoTest.
 *
 * @author  (Jason)
 * @version (10.09.2019)
 */
public class ExerciseTwoTest
{
    @Test
    public void testConcat()
   {
    ExerciseTwo e2 = new ExerciseTwo();
    e2.ex1("Jason");
    assertEquals(15, e2.getSum(10, 5));
    assertEquals(16, e2.getQuotient(50, 3));
    assertEquals(103, e2.getCalc(52,4,3,45));
    e2.getMulti(2);
    assertEquals(20.0, 1, e2.getAvg(10.0, 20.0, 30.0));
    e2.swapNum(20,10);
   }
}
