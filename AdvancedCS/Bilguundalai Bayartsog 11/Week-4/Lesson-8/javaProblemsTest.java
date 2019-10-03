

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class javaProblemsTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class javaProblemsTest
{
    @Test
    public void testAverage()
    {
        javaProblems a = new javaProblems();
        int[] array = {1, 2, 3, 4, 5};
        int[] array1 = {7, 2, 8, 4, 1};
        int[] array3 = {1, 2, 2, 4, 5};
        assertEquals(3, a.getAverage(array)); 
        assertEquals(true, a.value(array, 3));
        assertEquals(0, a.index(array, 1));
        assertEquals(2, a.secondLargestElement(array));
        assertEquals(2, a.duplicate(array3));
        
    }
    
    
}
