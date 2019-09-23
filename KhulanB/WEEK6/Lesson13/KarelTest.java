

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

/**
 * The test class KarelTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class KarelTest
{
   @Test 
   public void testMyName()
   {
       Karel karel = new Karel();
       assertEquals("SuperKarel", karel.getMyName());
       ArrayList<String> list = new ArrayList<String>();
       assertEquals(new ArrayList(), list);
       karel.addElements();
       ArrayList<String> expectedList = new ArrayList<String>();
       expectedList.add("Test");
       expectedList.add("Next");
       assertEquals(expectedList, karel.getMyArrayList());
    }
}
