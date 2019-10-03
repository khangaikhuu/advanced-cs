
import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class KarelTest.
 *
 * @author  (Amina)
 * @version (23.09.2019)
 */
public class KarelTest
{
    @Test
    public void myNameTest()
    {
    Karel karel = new Karel();
    assertEquals("SuperKarel", karel.getMyName()); 
    Karel karelOne = new Karel ("New Karel");
    int[] array = {1,2,3};
    Karel karelTwo = new Karel ("New Karel", array);
    
    ArrayList<String> list = new ArrayList<String>();
    assertEquals(new ArrayList(), list);
    karel.addElements();
    ArrayList<String> expectedList = new ArrayList<String>();
    expectedList.add("Test");
    expectedList.add("Next");
    assertEquals(expectedList, karel.getMyArrayList());
    ArrayList<String> removedList = new ArrayList<String>();
    removedList.add("Test");
    expectedList.remove(1);
    assertEquals(removedList, expectedList);
   }
}
