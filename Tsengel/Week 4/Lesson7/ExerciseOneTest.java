import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExerciseOneTest.
 *
 * @author  (Tsengel)
 * @version (11.09.2019)
 */
public class ExerciseOneTest
{
    @Test
    public void testCheckNum()
    {
        ExerciseOne ex1 = new  ExerciseOne();
        ex1.checkNumber(-1);
        ex1.largestNum(1,2,3);
        ex1.getWeek(2);
        ex1.getNumbers();
    }
}
