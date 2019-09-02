

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class helloworldTest.
 *
 * @author  (Manal)
 * @version (1.0)
 */
public class helloworldTest
{
    @Test
    public void testMyGetInt(){
        helloworld h1 = new helloworld();
        assertEquals(10, h1.getMyInt());
        assertEquals(2123123123, h1.getMyLong());
        assertEquals("Hello World", h1.getMyString());
        assertEquals(true, h1.getMyBoolean());
        assertEquals('C', h1.getMyChar());
        assertEquals(10, 1, h1.getMyDouble());
        assertEquals(10., 1, h1.getMyFloat());
        assertEquals(76, h1.getMyShort());
    }
}
