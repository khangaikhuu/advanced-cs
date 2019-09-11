

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExerciseTwoTest.
 *
 * @author  (Amina)
 * @version (10.09.2019)
 */
public class ExerciseTwoTest
{
    @Test
    public void TestMain()
    {
        ExerciseTwo two = new ExerciseTwo();
        two.main("Khangai");
        assertEquals(15, two.getSum());
        assertEquals(16, two.getDivision());
        assertEquals(4, two.getCalculations(1,0,2,3));
        two.getMultiplications(8);
        assertEquals(20.0,1,two.getAverage(10.0,20.0,30.0));
        two.getSwap();
    }
}
