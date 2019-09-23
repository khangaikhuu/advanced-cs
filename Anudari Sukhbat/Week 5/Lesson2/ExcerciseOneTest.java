

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExcerciseOneTest.
 *
 * @author  (Anudari Sukhbat)
 * @version (a version number or a date)
 */
public class ExcerciseOneTest
{
  
    @Test
   public void testMyArea()
   {
       ExcerciseOne one = new ExcerciseOne();
       assertEquals(true, one.compareArrays());
       assertEquals(50.24, 1, ExcerciseOne.getArea(4));
    }
}
