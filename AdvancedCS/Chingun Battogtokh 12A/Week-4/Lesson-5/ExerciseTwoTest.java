

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
  public void getSum() 
  { 
      ExerciseTwo c4 = new ExerciseTwo(); 
      assertEquals(30, c4.getSum()); 
    } 
}
