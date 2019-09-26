

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
   public void testExerciseTwo()
   {
       ExerciseTwo e1 = new ExerciseTwo();
       assertEquals("Hello computer", e1.concHello("computer"));
       assertEquals(15, e1.sumOfTwo(5,10));
       assertEquals(16, e1.quotientOfTwo(50,3));
       assertEquals(9, e1.valueOfDigits(45));
    }
    
}
