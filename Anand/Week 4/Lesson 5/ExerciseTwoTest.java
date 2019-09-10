

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
    public void test()
    {
      ExerciseTwo f = new ExerciseTwo();
      assertEquals(30, f.getSum());
    }
}
