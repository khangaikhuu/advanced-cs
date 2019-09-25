

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
        sq.changeColor("red");
        Square fq = new Square();
        fq.makeVisible();
        fq.changeSize(20);
        fq.moveHorizontal(-50);
        fq.changeColor("black");
    }
}
