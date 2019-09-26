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
  public void testConcat()
  {
      ExerciseTwo e2 = new ExerciseTwo();
      e2.changeOutput("Tsengel");
      assertEquals(15, e2.getSum(10,5));
      assertEquals(16, e2.getQuotient(50,3));
      assertEquals(8, e2.getCalculation(1,2,3,4));
      e2.getMultiplication(2);
      assertEquals(20.0,1,e2.getAverage(10.0,20.0,30.0));
      e2.changeNum(20,10);
    }
}
