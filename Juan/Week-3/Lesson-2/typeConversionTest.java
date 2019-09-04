

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class type_conversionTest.
 *
 * @author  (Juan)
 * @version (a version number or a date)
 */
public class typeConversionTest
{
    typeConversion tc = new typeConversion();
   @Test
   public void testGetA()
   {
   assertEquals(10, tc.getA());
   tc.convertA(20);
   assertEquals(20.0,1, tc.getB());
   
   }
   @Test
   public void testCast()
   {
       assertEquals(25,1, tc.sumNums(5,20));
    }
   
}

