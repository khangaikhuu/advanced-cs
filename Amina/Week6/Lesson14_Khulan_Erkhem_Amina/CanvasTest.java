

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CanvasTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CanvasTest
{
   @Test
   public void personTest()
   {
       Person p1 = new Person();
       p1.moveRight();
       p1.makeVisible();
       p1.moveVertical(-30);
       Person p2 = new Person();
       p2.moveLeft();
       p2.makeVisible();
       p2.changeSize(40,20);
       p2.moveVertical(-27);
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
