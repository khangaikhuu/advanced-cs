

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MyArrayTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MyArrayTest
{
  @Test
  public void mrKhangaiTest()
  {
    //private String[] mrKhangai = {"1", "2", "3"};
    MyArray myObj = new MyArray();
    assertEquals(3, myObj.getSizeOfArrayMrKhangai());
    assertEquals("1", myObj.getMyElementMrKhangai(0));
    assertEquals("2", myObj.getMyElementMrKhangai(1));
    assertEquals("3", myObj.getMyElementMrKhangai(2));
  }
}
