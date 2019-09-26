

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExerciseTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ExerciseTest
{
   @Test 
   public void testSum()
   { 
       Exercise c4 = new Exercise(); 
       assertEquals(45, c4.sumOfArray()); 
    } 
}
