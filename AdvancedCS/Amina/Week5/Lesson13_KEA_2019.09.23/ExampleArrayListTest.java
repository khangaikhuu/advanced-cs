import java.util.ArrayList;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExampleArrayListTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ExampleArrayListTest
{
   @Test
  public void testArrayList()
  {
   ExampleArrayList ex1 = new ExampleArrayList();
   ArrayList<String> expected = new ArrayList();
   expected.add("Lion");
   expected.add("Tiger");
   expected.add("Cat");
   expected.add("Dog");
   assertEquals(expected, ex1.createArrayList());
  }
}
