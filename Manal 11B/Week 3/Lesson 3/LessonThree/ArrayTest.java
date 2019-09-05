

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ArrayTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ArrayTest
{
  @Test
  public void mrKhangaiTest()
  {
    //private String[] mrKhangai = {"1", "2", "3"};
    Array a = new Array();
    assertEquals(3, a.getSizeOfArrayMrKhangai());
    assertEquals("1", a.getMyElementMrKhangai(0));
    assertEquals("2", a.getMyElementMrKhangai(1));
    assertEquals("3", a.getMyElementMrKhangai(2));
  }
  @Test
    public void myTsengelTest()
    {
        Array a = new Array();
        assertEquals(5, a.getSizeOfArrayTsengel());
        assertEquals('a', a.getMyElementTsengel(0));
        assertEquals('b', a.getMyElementTsengel(1));
        assertEquals('c', a.getMyElementTsengel(2));
        assertEquals('d', a.getMyElementTsengel(3));
        assertEquals('e', a.getMyElementTsengel(4));
    }
  @Test
  public void khangaridTest()
  {
    Array a = new Array();
    assertEquals(5, a.getSizeOfArrayKhangarid());
    assertEquals(3.22f, 1, a.getMyElementKhangarid(0));
    assertEquals(7.22f, 1, a.getMyElementKhangarid(1));
    assertEquals(11.22f, 1, a.getMyElementKhangarid(2));  
    assertEquals(15.22f, 1, a.getMyElementKhangarid(3));   
    assertEquals(19.22f, 1, a.getMyElementKhangarid(4));   
  }

  @Test
  public void msAminerdeneTest()
  {
    Array a = new Array();
    assertEquals(4, a.getSizeOfArrayMsAmina());
    assertEquals("Hey", a.getMyElementMsAmina(0));
    assertEquals("Ohh", a.getMyElementMsAmina(1));
    assertEquals("Hi", a.getMyElementMsAmina(2));
    assertEquals("Ok", a.getMyElementMsAmina(3));
    }
  
  @Test
  public void khulanTest()
  {
    Array a = new Array();
    assertEquals(4, a.getSizeOfArrayKhulan());
    assertEquals(1.2,1, a.getMyElementKhulan(0));
    assertEquals(2.9,1, a.getMyElementKhulan(1));
    assertEquals(3.4,1, a.getMyElementKhulan(2));
    assertEquals(4.6,1, a.getMyElementKhulan(3));
  }
  @Test
  public void erkhemTest()
  {
    //private String[] erhkem = {"3", "2", "32", "hi", "P"};
    //getSizeOfArrayErkhem
    //getMyElementErkhem
    Array a = new Array();
    assertEquals(5, a.getSizeOfArrayErkhem());
    assertEquals("3" ,a.getMyElementErkhem(0));
    assertEquals("2" , a.getMyElementErkhem(1));
    assertEquals("32", a.getMyElementErkhem(2));
    assertEquals("hi", a.getMyElementErkhem(3));
    assertEquals("P", a.getMyElementErkhem(4));
	}
  
  @Test
  public void jasonTest()
  {
    Array a = new Array();
    assertEquals(2, a.getSizeOfArrayJason());
    assertEquals(140, a.getMyElementJason(0));
    assertEquals(193, a.getMyElementJason(1));
  }
  
  @Test
  public void juanCarlosTest()
  {
    Array a = new Array();
    assertEquals(4,a.getSizeofArrayjuanCarlos());
    assertEquals(1,a.getMyElementjuanCarlos(0));
    assertEquals(6,a.getMyElementjuanCarlos(1));
    assertEquals(8,a.getMyElementjuanCarlos(2));
    assertEquals(3,a.getMyElementjuanCarlos(3));
  }
  
  @Test
  public void bilguundalaiTest()
  {
    Array a = new Array();
    assertEquals(3, a.getSizeOfArrayBilguundalai());
    assertEquals("Yes", a.getMyElementBilguundalai(0));
    assertEquals("No", a.getMyElementBilguundalai(1));
    assertEquals("JutsuMeister1008", a.getMyElementBilguundalai(2));
  }
  public void haYeonTest()
  {
    Array a = new Array();
    assertEquals(0, a.getSizeOfArrayhaYeon());
  }
  @Test 
  public void anudariTest()
  {
     Array a = new Array();
     assertEquals(4, a.getSizeOfArrayAnudari());
  }               
  @Test
  public void hannahTest()
  {
    Array a = new Array();
    assertEquals(3, 1, a.getSizeOfArrayHannah());
    assertEquals(2.5, 1, a.getMyElementHannah(0));
    assertEquals(4.6, 1, a.getMyElementHannah(1));
    assertEquals(9.1, 1, a.getMyElementHannah(2));
  }
  
  @Test
  public void testArrayManal(){
    Array a = new Array();
    assertEquals(5, a.sizeOfArrayManal());
    assertEquals(1.1, 1, a.getMyElementManal(0));
    assertEquals(1.2, 1, a.getMyElementManal(1));
    assertEquals(1.3, 1, a.getMyElementManal(2));
    assertEquals(1.4, 1, a.getMyElementManal(3));
  }
}
