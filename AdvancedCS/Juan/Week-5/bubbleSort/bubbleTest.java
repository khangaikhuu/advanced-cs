
import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class bubbleTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class bubbleTest
{
    @Test
    public void test()
    {
        bubble ex = new bubble();
        int [] a={1,2,3};
        int [] b = {3,1,2};
        b=ex.sort(b);
        assertEquals(true,Arrays.equals(a,b));
    }
}
