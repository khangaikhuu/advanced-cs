

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CircleTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CircleTest
{
    @Test
    public void testCircle()
    {
       Circle c1 = new Circle(); 
       c1. makeVisible(); 
       c1.changeColor("yellow");
       c1.moveHorizontal(125);
       c1.changeSize(50);
       c1.moveVertical(25);
    }
}
