

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExerciseTwoTest.
 *
 * @author  (Amina)
 * @version (2019.09.09)
 */
public class ExerciseTwoTest
{
    @Test
    public void getSum()
    {
        ExerciseTwo ex2 = new ExerciseTwo();
        assertEquals(30, ex2.getSum());
        assertEquals(40, ex2.getSum());
    }
}
