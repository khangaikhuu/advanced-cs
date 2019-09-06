import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExcerciseTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ExcerciseTest
{
   @Test
   public void testMySum()
   {
       Excercise c1 = new Excercise();
       assertEquals(46, c1.calculateMySum());
    }
}
