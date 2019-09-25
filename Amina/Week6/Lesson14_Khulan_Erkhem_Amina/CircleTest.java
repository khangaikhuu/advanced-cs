

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
   public void CircleTest()
   {
       Circle ground1 = new Circle();
       ground1.makeVisible();
       ground1.changeSize(1000);
       ground1.moveHorizontal(-500);
       ground1.moveVertical(100);
       ground1.changeColor("green");
       Circle sun1 = new Circle();
       sun1.makeVisible();
       sun1.changeSize(50);
       sun1.changeColor("yellow");
       sun1.moveHorizontal(100);
    }
}
