

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TypeConversionTest.
 *
 * @author  (Chingun)
 * @version (04.09.2019)
 */
public class TypeConversionTest
{
   @Test 
   public void testGetA() 
   { 
       TypeConversion tc = new TypeConversion();
       assertEquals(10,tc.getA()); 
       tc.convertA(20); 
       assertEquals(20.0, 1,tc.getB()); 
       assertEquals(20.0, 1,tc.GetF(10, 10)); 
    } 
    
}
