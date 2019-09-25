

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TriangleTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TriangleTest
{
    @Test
    public void testSquare()
    {
        Square sq = new Square();
        sq.makeVisible();
        SquareTwo sqt = new SquareTwo();
        sqt.makeVisible();
        sqt.moveLeft();
        sqt.moveUp();
        Triangle tr = new Triangle();
        tr.makeVisible();
        tr.moveLeft();
        tr.moveUp();
        Circle cr = new Circle();
        cr.makeVisible();
        cr.moveUp();
    }
}
