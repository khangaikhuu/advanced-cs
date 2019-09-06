

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class HelloWorldTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class HelloWorldTest
{
    @Test
    public void MyMethodTest()
    {
        HelloWorld hw = new HelloWorld();
        assertEquals(hw.getHelloWorld(), "Hello World");
    }

    @Test
    public void secondTest()
    {
        HelloWorld helloWor1 = new HelloWorld();
        assertNotNull(helloWor1.getHelloWorld());
    }


    @Test
    public void testCreateName()
    {
        HelloWorld helloWor1 = new HelloWorld();
        assertEquals("Hello World", helloWor1.getHelloWorld());
    }
}




