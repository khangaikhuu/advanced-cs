

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TypeConversionTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TypeConversionTest
{
  @Test
   public void testGetA()
   {
     TypeConversion tc = new TypeConversion();
     assertEquals(10, tc.getA());
     tc.convertA(20);
     assertEquals(20.0, 1,  tc.getB());
     assertEquals(12.0, 1, tc.convertTwoNumbers(10, 2));
   }
}
