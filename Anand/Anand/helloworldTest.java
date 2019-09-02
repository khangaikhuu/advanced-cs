

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class helloworldTest.
 *
 * @author  (Anand)
 * @version (1.0)
 */
public class helloworldTest
{
    @Test
    public void testMyGetInt()
    {
        helloworld h1 = new helloworld();
        assertEquals(10, h1.getMyInt());
    }
    @Test
    public void testMyGetLong()
    {
      helloworld h2 = new helloworld();
      assertEquals(1231231231, h2.getMyLong());
    }
    @Test
    public void testMyGetString()
    {
        helloworld h3 = new helloworld();
        assertEquals("Hello World", h3.getMyString());
    }
    @Test
    public void testMyGetBoolean()
    {
      helloworld h4 = new helloworld();
      assertEquals(true, h4.getMyBoolean());
    }
    @Test
    public void testMyGetChar()
    {
      helloworld h5 = new helloworld();
      assertEquals('C', h5.getMyChar());
    }
    @Test
    public void testMyGetDouble()
    {
      helloworld h6 = new helloworld();
      assertEquals(10.0, 1, h6.getMyDouble());
    }
    @Test
    public void testMyGetFloat()
    {
      helloworld h7 = new helloworld();
      assertEquals(10.0f,1, h7.getMyFloat());
    }
}

