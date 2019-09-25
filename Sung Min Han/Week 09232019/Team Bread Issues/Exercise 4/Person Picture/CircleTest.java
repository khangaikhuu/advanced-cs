

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
       
       Circle c3 = new Circle(); 
       c3.makeVisible(); 
       c3.changeColor("green");
       c3.changeSize(1000);
       c3.moveVertical(125);
       c3.moveHorizontal(-500);
       
       Person c2 = new Person(); 
       c2.makeVisible(); 
       c2.changeSize(50,25);
       c2.moveRight();
       
       Person c4 = new Person(); 
       c4.makeVisible(); 
       c4.changeSize(50,25);
    }
}
