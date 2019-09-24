

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
    }
}
