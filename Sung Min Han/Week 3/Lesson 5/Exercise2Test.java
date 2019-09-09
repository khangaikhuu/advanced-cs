import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Exercise2Test.
 *
 * @author  (Sung Min)
 * @version (092019)
 */
public class Exercise2Test
{
    @Test
    public void TestExercise2()
    {
         Exercise2 ex2 = new Exercise2();
         assertEquals(30, ex2.getSum());
         assertEquals(40, ex2.getSum());
    }
}
