

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Circle1Test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Circle1Test
{
    @Test
    public void testCircle1()
    {  
       Circle c3 = new Circle(); 
       c3.makeVisible(); 
       c3.changeColor("green");
       c3.changeSize(1000);
       c3.moveVertical(125);
       c3.moveHorizontal(-500);
    }
}
