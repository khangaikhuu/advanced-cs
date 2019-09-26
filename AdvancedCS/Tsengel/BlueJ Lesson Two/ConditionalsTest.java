import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ConditionalsTest.
 *
 * @author  (Tsengel)
 * @version (04.09.2019)
 */
public class ConditionalsTest
{
   @Test
   public void testCheckCondtional()
   {
       Conditionals c = new Conditionals();
       assertEquals(false, c.checkMaximum());
       assertEquals("The number one is bigger", c.checkMaximumTwoNumbers(20,10));
       assertEquals("The number two is bigger", c.checkMaximumTwoNumbers(5,10));
       assertEquals("The number is equal", c.checkMaximumTwoNumbers(10,10));
    }
}
