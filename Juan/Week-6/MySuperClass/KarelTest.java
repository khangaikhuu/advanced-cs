import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class KarelTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class KarelTest
{
    @Test
    public void myNameTest()
    {
        int[] ar = {2,4};
        Karel karel = new Karel();
        Karel karelOne = new Karel("new karel");
        Karel karelTwo = new Karel("New karel",ar);
        assertEquals("SuperKarel",karel.getMyName());
        ArrayList<String> array = new ArrayList();
        assertEquals(new ArrayList(), array);
        karel.addElements();
        ArrayList<String> expectedList = new ArrayList();
        expectedList.add("num");
        expectedList.add("not_num");
        assertEquals(expectedList, karel.getMyArrayList());
    }
}
