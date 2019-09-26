
import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExcersieOneTest.
 *
 * @author  (Hannah)
 * @version (23.09.2019)
 */
public class ExcersieOneTest
{
    @Test
    public void testMyMethod()
    {
       ExcersieOne e1 = new ExcersieOne();
       ArrayList<String> list = new ArrayList<String>();
       assertEquals(new ArrayList(), list);
       e1.addElements();
       ArrayList<String> expectedList = new ArrayList<String>();
       expectedList.add("Elephant");
       assertEquals(expectedList, e1.getMyArrayList());
    }
}
