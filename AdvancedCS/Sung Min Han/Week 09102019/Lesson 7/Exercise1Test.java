import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Exercise1Test.
 *
 * @author  (Sung Min)
 * @version (9112019)
 */
public class Exercise1Test
{
    @Test
    public void ExerciseTest()
    {
        Exercise1 e1 = new Exercise1();
        e1.checkNum(4);
        e1.checkNum(-2);
        e1.checkGreat(12, 24, 33);
        e1.checkDay(3);
        e1.printNatNum();
    }
}
