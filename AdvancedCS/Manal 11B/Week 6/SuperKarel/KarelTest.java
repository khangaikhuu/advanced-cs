

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
/**
 * The test class KarelTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class KarelTest
{
    @Test
    public void test(){
        Karel k = new Karel();
        assertEquals("SuperKarel", k.getMyName());
        ArrayList<String> list = new ArrayList<String>();
        assertEquals(new ArrayList(), list);
        k.addElement();
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("test");
        list1.add("next");
        assertEquals(list1, k.getArray());
    }
}
