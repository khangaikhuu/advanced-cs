import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

/**
 * The test class Exercise1Test.
 *
 * @author  (Sung Min)
 * @version (9172019)
 */
public class Exercise1Test
{
    @Test
    public void testMyArea()
    {
        Exercise1 ex1 = new Exercise1();
        assertEquals(50.24, 1, Exercise1.getArea(4));
        assertEquals(true, ex1.compareArrays());
    }
}
