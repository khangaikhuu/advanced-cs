import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class KarelTest.
 *
 * @author  (Bilguundalai)
 * @version (23.09.2019)
 */
public class KarelTest
{
    @Test
    public void myNameTest()
    {
        Karel karel = new Karel();
        assertEquals("Karel", karel.getMyName());
        ArrayList<String> list = new ArrayList<String>();
        assertEquals(new ArrayList(), list);
        karel.addElements();
        ArrayList<String> expectedList = new ArrayList<String>();
        expectedList.add("Test");
        expectedList.add("Next");
        assertEquals(expectedList, karel.getMyArrayList());
        
        
    }
    
}
