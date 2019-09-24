
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * Write a description of class SquareTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SquareTest
{
    @Test
    public void testSquare()
    {
        Square sq = new Square();
        sq.makeVisible();
    }

    @Test
    public void testCircle()
    {
        Circle ci = new Circle();
        ci.makeVisible();
    }
}

