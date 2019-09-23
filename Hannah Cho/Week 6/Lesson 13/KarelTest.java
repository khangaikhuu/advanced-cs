
import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class KarelTest.
 *
 * @author  (Hannah)
 * @version (23.09.2019)
 */
public class KarelTest
{
    @Test
    public void myNameTest()
    {
       Karel k1 = new Karel();
       assertEquals("SuperKarel", k1.getMyName());
       ArrayList<String> list = new ArrayList<String>();
       assertEquals(new ArrayList(), list);
       k1.addElements();
       ArrayList<String> expectedList = new ArrayList<String>();
       expectedList.add("Test");
       expectedList.add("Next");
       assertEquals(expectedList, k1.getMyArrayList());
    }
}
