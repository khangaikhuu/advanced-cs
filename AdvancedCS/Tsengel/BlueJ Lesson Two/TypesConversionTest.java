import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TypesConversionTest.
 *
 * @author  (Tsengel)
 * @version (04.09.2019)
 */
public class TypesConversionTest
{
   @Test
   public void testConvertSum()
   {
       TypeConversion tc = new TypeConversion();
       assertEquals(10, tc.getA());
       tc.convertA(20);
       assertEquals(20.0,1, tc.getB());
       assertEquals(30.0,1, tc.convertSum(10,20));
    }
}
