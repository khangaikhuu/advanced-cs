

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExerciseOneTest.
 *
 * @author  (khulan)
 * @version (09.11.19)
 */
public class ExerciseOneTest
{
   @Test
   public void testCheckNumber()
   {
       ExerciseOne ex1 = new ExerciseOne();
       ex1.checkNumber(3);
       ex1.checkNumber(-1);
       ex1.bigNumber(25, 78, 87);
       ex1.weekDay(7);
       ex1.getNumbers();
    }
}

    
   
