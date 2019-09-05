

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ClassArrayTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
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
public class ClassArrayTest
{
  @Test
  public void mrKhangaiTest()
  {
    //private String[] mrKhangai = {"1", "2", "3"};
    ClassArray myObj = new ClassArray();
    assertEquals(3, myObj.getSizeOfArrayMrKhangai());
    assertEquals("1", myObj.getMyElementMrKhangai(0));
    assertEquals("2", myObj.getMyElementMrKhangai(1));
    assertEquals("3", myObj.getMyElementMrKhangai(2));
  }
  @Test
    public void myTsengelTest()
    {
        ClassArray myObj = new ClassArray();
        assertEquals(5, myObj.getSizeOfArrayTsengel());
        assertEquals('a', myObj.getMyElementTsengel(0));
        assertEquals('b', myObj.getMyElementTsengel(1));
        assertEquals('c', myObj.getMyElementTsengel(2));
        assertEquals('d', myObj.getMyElementTsengel(3));
        assertEquals('e', myObj.getMyElementTsengel(4));
    }
  
  @Test
  public void khangaridTest()
  {
    ClassArray myObj = new ClassArray();
    assertEquals(5, myObj.getSizeOfArrayKhangarid());
    assertEquals(3.22f,1, myObj.getMyElementKhangarid(0));
    assertEquals(7.22f,1, myObj.getMyElementKhangarid(1));
    assertEquals(11.22f,1, myObj.getMyElementKhangarid(2));  
    assertEquals(15.22f,1, myObj.getMyElementKhangarid(3));   
    assertEquals(19.22f,1, myObj.getMyElementKhangarid(4));   
  }
  
  public void msAmina()
  {
    ClassArray myObj = new ClassArray();
    assertEquals(4, myObj.getSizeOfArrayMsAminerdene());
  }
  public class MyArrayTest
{
    @Test
    public void msAminerdeneTest()
    {
       ClassArray myObj = new ClassArray();
       assertEquals(4, myObj.getSizeOfArrayMsAminerdene());
       assertEquals("Hey", myObj.getMyElementMsAminerdene(0));
       assertEquals("Ohh", myObj.getMyElementMsAminerdene(1));
       assertEquals("Hi", myObj.getMyElementMsAminerdene(2));
       assertEquals("Ok", myObj.getMyElementMsAminerdene(3));
    }
}
  @Test
  public void khulanTest()
  {
    ClassArray myObj = new ClassArray();
    assertEquals(4, myObj.getSizeOfArrayKhulan());
    assertEquals(1.2,1, myObj.getMyElementKhulan(0));
    assertEquals(2.9,1, myObj.getMyElementKhulan(1));
    assertEquals(3.4,1, myObj.getMyElementKhulan(2));
    assertEquals(4.6,1, myObj.getMyElementKhulan(3));
  }
  @Test
  public void erkhemTest()
  {
    //private String[] erhkem = {"3", "2", "32", "hi", "P"};
    //getSizeOfArrayErkhem
    //getMyElementErkhem
    ClassArray erkObj = new ClassArray();
    assertEquals(5, erkObj.getSizeOfArrayErkhem());
    assertEquals("3" ,erkObj.getMyElementErkhem(0));
    assertEquals("2" , erkObj.getMyElementErkhem(1));
    assertEquals("32", erkObj.getMyElementErkhem(2));
    assertEquals("hi", erkObj.getMyElementErkhem(3));
    assertEquals("P", erkObj.getMyElementErkhem(4));
	}
  
  @Test
  public void jasonTest()
  {
    ClassArray myObj = new ClassArray();
    assertEquals(2, myObj.getSizeOfArrayJason());
    assertEquals(140, myObj.getMyElementJason(0));
    assertEquals(193, myObj.getMyElementJason(1));
  }
  
  @Test
  public void juanCarlosTest()
  {
    ClassArray jcObj =  new ClassArray();
    assertEquals(4,jcObj.getSizeofArrayjuanCarlos());
    assertEquals(1,jcObj.getMyElementjuanCarlos(0));
    assertEquals(6,jcObj.getMyElementjuanCarlos(1));
    assertEquals(8,jcObj.getMyElementjuanCarlos(2));
    assertEquals(3,jcObj.getMyElementjuanCarlos(3));
  }
  
  @Test
  public void bilguundalaiTest()
  {
    ClassArray myObj = new ClassArray();
    assertEquals(5, myObj.getSizeOfArrayBilguundalai());
    assertEquals("5", myObj.getMyElementBilguundalai(0));
    assertEquals("4", myObj.getMyElementBilguundalai(1));
    assertEquals("1", myObj.getMyElementBilguundalai(2));
    assertEquals("pro", myObj.getMyElementBilguundalai(3));
    assertEquals("JutsuMeister", myObj.getMyElementBilguundalai(4));
    
  }
 /* Wait until SungMin finishes
  * public void SungMinTest()
  {
		ClassArray myOb = new ClassArray();
    assertEquals(4, myOb.sizeOfsungMinArray());
    assertEquals(9, myOb.getMyElementSungMin(1));
    assertEquals(8, myOb.getMyElementSungMin(2));
    assertEquals(7, myOb.getMyElementSungMin(3));
    assertEquals(6, myOb.getMyElementSungMin(4));
  } */
  
  public void haYeonTest()
  {
    ClassArray myObj = new ClassArray();
    assertEquals(0, myObj.getSizeOfArrayhaYeon());
  }
      @Test
  public void testArrayManal(){
    ClassArray a = new ClassArray();
    assertEquals(5, a.sizeOfArrayManal());
    
  }
  
    @Test 
    public void anudariTest()
    {
        ClassArray myObj = new ClassArray();
        assertEquals(4, myObj.getSizeOfArrayAnudari());
    }               
  @Test
  public void hannahTest()
  {
    ClassArray myObj = new ClassArray();
    assertEquals(3, myObj.getSizeOfArrayHannah());
    assertEquals(2.5,1, myObj.getMyElementHannah(0));
    assertEquals(4.6,1, myObj.getMyElementHannah(1));
    assertEquals(9.1, 1, myObj.getMyElementHannah(2));
  }
  
  /* Wait for Chingun to finish 
   * @Test 
  public void ChingunTest() 
  { 
    ClassArray myObj = new ClassArray(); 
    assertEquals(5, myObj.getSizeOfArrayChingun());
  }
  */
  
}


