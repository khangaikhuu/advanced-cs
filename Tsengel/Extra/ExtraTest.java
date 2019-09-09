import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExtraTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ExtraTest
{
    @Test
    public void testSumArray()
    {
        Extra c1 = new Extra();
        int[]myArray = {1,2,3};
        assertEquals(6, c1.getSum(myArray));   
        assertEquals(6, c1.getSum(myArray));   
    }
}
