import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExerciseTwoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ExerciseTwoTest
{
    @Test
    public void test2()
    {
        ExerciseTwo e2 = new ExerciseTwo();
        e2.ex2("Sung Min"); 
        assertEquals(15, e2.getSum(10, 5));
        assertEquals(16, e2.getDiv(50, 3));
        assertEquals(-7, e2.getOp(4, 3, 2, 1));
        e2.getMult(2);
        assertEquals(20.0,1, e2.getAver(10.0, 20.0, 30.0));
        e2.swapVar(20,10);
    }
}
