import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TriangleTest.
 *
 * @author  (Sung Min)
 * @version (9242019)
 */
public class TriangleTest
{
    @Test
    public void testTriangle()
    {
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
