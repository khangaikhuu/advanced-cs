

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BlueJTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BlueJTest
{
    @Test
    public void testGetInt()
    {
        BlueJ b1 = new BlueJ();
        assertEquals(10, b1.getInt());
    }
    @Test
    public void testGetString()
    {
        BlueJ b2 = new BlueJ();
        assertEquals("Hello World", b2.getString());
    }
    @Test
        public void testGetLong()
    {
        BlueJ b3 = new BlueJ();
        assertEquals(Integer.MAX_VALUE, b3.getLong());
    }
    @Test
       public void testGetChar()
    {
        BlueJ b4 = new BlueJ();
        assertEquals('C', b4.getChar());
    }
    @Test
       public void testGetFloat()
    {
        BlueJ b5 = new BlueJ();
        assertEquals(10.5f,1,  b5.getFloat());
    }
    @Test
        public void testGetBoolean()
     {
         BlueJ b6= new BlueJ();
         assertEquals(false, b6.getBoolean());
        }
    @Test
        public void testGetDouble()
        {
            BlueJ b7 = new BlueJ();
            assertEquals(4.5,1, b7.getDouble());
        }
        
           
    
    
    /**
     * Default constructor for test class BlueJTest
     */
    public BlueJTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
