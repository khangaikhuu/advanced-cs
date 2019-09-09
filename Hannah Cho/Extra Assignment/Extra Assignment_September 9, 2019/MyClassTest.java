

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MyClassTest.
 *
 * @author  (Hannah)
 * @version (09.09.2019)
 */
public class MyClassTest
{
    @Test
    public void testMyClass()
    {
      MyClass c1 = new MyClass();
      assertEquals(, c1.getSum());
      assertEquals(, c1.getQuotient());
      assertEquals(, c1.maxValue());
      assertEquals(, c1.minValue());
    }
}
