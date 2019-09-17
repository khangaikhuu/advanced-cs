

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * The test class ExerciseOneTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ExerciseOneTest
{
  @Test 
  public void testMyArea() 
  { 
      ExerciseOne c4 = new ExerciseOne();
      assertEquals(50.24, 1, c4.getArea(4)); 
      assertEquals(true, c4.compareArrays());
    } 
}
