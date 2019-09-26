
import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class KarelTest.
 *
 * @author  (Erkhem)
 * @version (9/23/19)
 */
public class KarelTest
{
    @Test
    public void myNameTest()
    {
        Karel k = new Karel();
        assertEquals("Karel", k.getName());
        ArrayList<Integer> list = new ArrayList<Integer>();
        assertEquals(new ArrayList(), list);
        k.addElements();
        ArrayList<Integer> expectedList = new ArrayList<Integer>();
        expectedList.add(5);
        expectedList.add(10);
        assertEquals(expectedList , k.getArrayList());
    }
}
