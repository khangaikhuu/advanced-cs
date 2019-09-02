

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class helloWorldTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class helloWorldTest
{
  @Test 
  public void testGetMyInt()
  {
      helloWorld h1 = new helloWorld();
      assertEquals(1, h1.myInt());
      assertEquals(12223333, h1.myLong());
      assertEquals("Hello World", h1.myString());
      assertEquals(true, h1.myBoolean());
      assertEquals('C', h1.myChar());
      assertEquals(10.0, h1.mydouble());
    }
 
}


