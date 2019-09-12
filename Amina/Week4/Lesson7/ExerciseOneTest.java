

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExerciseOneTest.
 *
 * @author  (Amina)
 * @version (11.09.2019)
 */
public class ExerciseOneTest
{
    @Test
    public void testCheckNumber()
    {
    ExerciseOne ex1 = new ExerciseOne();
    ex1.checkNumber(3);
    ex1.checkNumber(-1);
    ex1.greatestNumber(25,78,87);
    ex1.weekDay(7);
    ex1.getNumbers(10);
  }
}
