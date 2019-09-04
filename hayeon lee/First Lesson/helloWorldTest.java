

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class helloWorldTest.
 *
 * @author  (Hayeon Lee)
 * @version (1.0)
 */
public class helloWorldTest
{
    @Test
    public void testGetMyInt()
    {
        helloWorld h1 = new helloWorld();
        assertEquals(10, h1.getMyInt() );
        assertEquals(1232213131, h1.getMyLong() );
        assertEquals("Hello World", h1.getMyString() );
        assertEquals(true, h1.getMyBoolean() );
        assertEquals('C', h1.getMyChar());
        assertEquals(10.0, h1.getMyDouble() );
        assertEquals(10.0f, h1.getMyFloat() );
    }
    
    
}
