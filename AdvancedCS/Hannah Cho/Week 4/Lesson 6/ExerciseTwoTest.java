

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExerciseTwoTest.
 *
 * @author  (Hannah)
 * @version (10.09.2019)
 */
public class ExerciseTwoTest
{
    @Test
    public void testMyMethod()
    {
        ExerciseTwo e2 = new ExerciseTwo();
        assertEquals(15, e2.getSum());
        assertEquals(16, e2.getQuotient());
        assertEquals(88, e2.getTotal(23,5,7,35));
        assertEquals(20.0, e2.findAverage());
    }
}
