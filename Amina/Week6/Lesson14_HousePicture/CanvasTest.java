

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
      Circle sun1 = new Circle();
       sun1.makeVisible();
       sun1.changeSize(50);
       sun1.changeColor("yellow");
       sun1.moveHorizontal(200);
       sun1.moveVertical(-30);
       Square sq = new Square();
        sq.makeVisible();
        sq.changeColor("red");
        Square fq = new Square();
        fq.makeVisible();
        fq.changeSize(20);
        fq.moveHorizontal(20);
        fq.moveVertical(20);
        fq.changeColor("black");
        Triangle tl = new Triangle();
        tl.makeVisible();
        tl.changeColor("green");
        tl.moveVertical(-75);
        tl.moveHorizontal(130);
        
   }
}
