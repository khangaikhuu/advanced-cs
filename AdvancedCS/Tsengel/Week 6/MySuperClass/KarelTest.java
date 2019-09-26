import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
/**
 * The test class KarelTest.
 *
* @author (Tsengel)
 * @version (23.09.2019)
 */
public class KarelTest
{
   @Test
   public void myNameTest()
   {
       Karel karel = new Karel();
       assertEquals("SuperKarel", karel.getMyName());
       ArrayList<String> list = new ArrayList<String>();
       assertEquals(new ArrayList(), list);
       karel.addElements();
       ArrayList <String> expectedList = new ArrayList<String>();
       expectedList.add("test");
       expectedList.add("next");
       assertEquals(expectedList, karel.getMyArrayList());
       
    }
}
