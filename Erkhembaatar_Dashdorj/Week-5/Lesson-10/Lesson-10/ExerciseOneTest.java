

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays; 


/**
 * The test class ExerciseOneTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ExerciseOneTest
{
    @Test
    public void testSorting()
    {
        ExerciseOne e1 = new ExerciseOne();
        int[] b ={1,2,3,4,5};
        e1.sort();
        assertEquals(true,Arrays.equals(b, e1.getSort()) ); 
    }
}
