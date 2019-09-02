

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class HelloWorldTest.
 *
 * @author  (Chingun)
 * @version (1.0)
 */
public class HelloWorldTest
{
   @Test 
   public void testGetMyInt()
   { 
       HelloWorld h1 = new HelloWorld();
    assertEquals(10, h1.getMyInt()); 
    assertEquals(1232321313, h1.getMyLong()); 
    assertEquals("Hello World", h1.getMyString()); 
    assertEquals(true, h1.getMyBoolean()); 
    assertEquals('C', h1.getMyChar()); 
    assertEquals(10,1, h1.getMyDouble()); 
    assertEquals(10,1,  h1.getMyFloat()); 
    assertEquals(45, h1.getMyShort()); 

} 
}
