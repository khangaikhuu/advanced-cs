

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class HelloWorldTest.
 *
 * @author  (Mr.Khangai)
 * @version (1.0)
 */
public class HelloWorldTest
{
   @Test
   public void testGetMyInt()
   {
       HelloWorld h1 = new HelloWorld();
       assertEquals(11, h1.getMyInt());
    }
}
