

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SquareTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SquareTest
{
    @Test
    public void testSquare()
    {
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
     
        
    }
}
