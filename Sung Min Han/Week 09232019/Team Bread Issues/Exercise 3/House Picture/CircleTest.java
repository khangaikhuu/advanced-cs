

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CircleTest.
 *
 * @author  (Sung Min, Tsengel, Jason)
 * @version (9242019)
 */
public class CircleTest
{
    @Test
    public void testCircle()
    {
        Circle cr = new Circle();
        cr.makeVisible();
        cr.moveRight();
        cr.moveRight();
        cr.moveRight();
        cr.moveRight();
        cr.moveUp();
        cr.moveUp();
        cr.moveRight();
        cr.moveRight();
        cr.moveRight();
        cr.changeSize(65);
        cr.changeColor("yellow");
        
        
        Square sq = new Square();
        sq.makeVisible();
        sq.moveDown();
        sq.moveLeft();
        sq.moveRight();
        sq.moveLeft();
        sq.moveLeft();
        sq.changeSize(65);
        
        Square s2 = new Square();
        s2.makeVisible();
        s2.changeColor("blue");
        s2.changeSize(20);
        s2.moveDown();
        s2.moveLeft();
        s2.moveDown();
        s2.moveDown();
        s2.moveRight();
        
        Triangle tr = new Triangle();
        tr.makeVisible();
        tr.moveUp();
        tr.moveUp();
        tr.moveUp();
        tr.moveRight();
        tr.moveRight();
        tr.moveRight();
        tr.moveRight();
        tr.moveRight();
        tr.moveRight();
        tr.changeSize(50, 80);
        
        
    }
}
