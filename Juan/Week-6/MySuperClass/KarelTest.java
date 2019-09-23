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
        Karel karel = new Karel();
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
