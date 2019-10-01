

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExerciseTwoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ExerciseTwoTest
{
   @Test
   public void testMain()
   {
       ExerciseTwo two = new ExerciseTwo();
       two.main("Khulan");
       assertEquals(15, two.getSum());
       assertEquals(16, two.getDivision());
       assertEquals(14, two.getCalculations(2,4,6,8));
       two.getMultiplication(8);
       assertEquals(20.0,1,two.getAverage(10.0,20.0,30.0));
       two.swapVariable(10,20);
    }
}