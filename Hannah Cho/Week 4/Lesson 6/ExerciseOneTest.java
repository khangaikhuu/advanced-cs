

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExerciseOneTest.
 *
 * @author  (Hannah)
 * @version (10.09.2019)
 */
public class ExerciseOneTest
{
    @Test
    public void testMyMethod()
    {
      ExerciseOne e1 = new ExerciseOne();
      e1.changeA();
      assertEquals("Hello World", e1.getA());
      e1.conditionals();
    }
}
