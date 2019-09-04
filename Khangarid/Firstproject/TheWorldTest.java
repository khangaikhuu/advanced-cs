

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TheWorldTest.
 *
 * @author  (khangarid)
 * @version (1.0)
 */
public class TheWorldTest
{
    @Test
    public void testGetMyInt()
    {
        TheWorld h1 = new TheWorld();
        assertEquals(10, h1.getMyInt());
    }
    @Test
    public void testGetMyLong()
    {
        TheWorld h1 = new TheWorld();
        assertEquals(1234567890, h1.getMyLong());
    }
    @Test
    public void testGetMyString()
    {
        TheWorld h1 = new TheWorld();
        assertEquals("The World", h1.getMyString());
    }
    @Test
    public void testGetMyBoolean()
    {
        TheWorld h1 = new TheWorld();
        assertEquals(true, h1.getMyBoolean());
    }
    @Test
    public void testGetMyChar()
    {
        TheWorld h1 = new TheWorld();
        assertEquals('C', h1.getMyChar());
    }
    @Test
    public void testGetMyDouble()
    {
        TheWorld h1 = new TheWorld();
        assertEquals(10.0,1, h1.getMyDouble());
    }
    @Test
    public void testGetMyFloat()
    {
        TheWorld h1 = new TheWorld();
        assertEquals(10.0f,1, h1.getMyFloat());
    }
}