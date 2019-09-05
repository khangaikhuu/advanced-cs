

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Hello_WorldTest.
 *
 * @author  (Juan)
 * @version (1.0)
 */
public class Hello_WorldTest
{
    Hello_World test = new Hello_World();
    @Test

    public void testGetMyInt()
    {
        assertEquals(10, test.getMyInt());
    }
    @Test
    public void testGetMyLong()
    {
        
        assertEquals(1000000, test.getMyLong());
    }
    @Test
    public void testGetMyString()
    {
        assertEquals("Hello World", test.getMyString());
    }
    @Test
    public void testGetMyBoolean()
    {
        assertEquals(true, test.getMyBoolean());
    }
    @Test
    public void testGetMyChar()
    {
        assertEquals('c', test.getMyChar());
    }
    @Test
    public void testGetMyDouble()
    {
        assertEquals(10.0,1, test.getMyDouble());
    }
    @Test
    public void testGetMyFloat()
    {
        assertEquals(10.0f,1, test.getMyFloat());
    }
}
