

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExerciseOneTest.
 *
 * @author  (Jason)
 * @version (11.09.2019)
 */
public class ExerciseOneTest
{
    @Test
    private void testcheckNum()
    {
        ExerciseOne e1 = new ExerciseOne();
        e1.checkNum(-1);
        e1.largeNum(2,4,6);
        e1.weekDay(1);
        e1.printNum();
    }
}