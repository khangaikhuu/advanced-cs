

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class myArrayTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class myArrayTest
{
  
    @Test 
    public void testMyArray()
    {
        myArray myObj = new myArray();
        assertEquals(4, myObj.getSizeOfArrayAnudari());
        assertEquals(3, myObj.getMyElementAnudari(0));
        assertEquals(4, myObj.getMyElementAnudari(1));
        assertEquals(7, myObj.getMyElementAnudari(2));
        assertEquals(9, myObj.getMyElementAnudari(3));
    }
      
  @Test
  public void mrKhangaiTest()
  {
    //private String[] mrKhangai = {"1", "2", "3"};
    myArray myObj = new myArray();
    assertEquals(3, myObj.getSizeOfArrayMrKhangai());
    assertEquals("1", myObj.getMyElementMrKhangai(0));
    assertEquals("2", myObj.getMyElementMrKhangai(1));
    assertEquals("3", myObj.getMyElementMrKhangai(2));
  }
  @Test
    public void myTsengelTest()
    {
        myArray myObj = new myArray();
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
    myArray myObj = new myArray();
    assertEquals(5, myObj.getSizeOfArrayKhangarid());
    assertEquals(3.22f, 1,myObj.getMyElementKhangarid(0));
    assertEquals(7.22f, 1, myObj.getMyElementKhangarid(1));
    assertEquals(11.22f,1,myObj.getMyElementKhangarid(2));  
    assertEquals(15.22f, 1, myObj.getMyElementKhangarid(3));   
    assertEquals(1.0f, 1, myObj.getMyElementKhangarid(3));   
  }
  
  public void msAmina()
  {
    myArray myObj = new myArray();
    assertEquals(4, myObj.getSizeOfArrayMsAmina());
  }
  @Test
  public void khulanTest()
  {
    myArray myObj = new myArray();
    assertEquals(4, myObj.getSizeOfArrayKhulan());
    assertEquals(1.2, 1, myObj.getMyElementKhulan(0));
    assertEquals(2.9, 1, myObj.getMyElementKhulan(1));
    assertEquals(3.4, 1, myObj.getMyElementKhulan(2));
    assertEquals(4.6, 1, myObj.getMyElementKhulan(3));
  }
  @Test
  public void erkhemTest()
  {
    
    myArray erkObj = new myArray();
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
    myArray myObj = new myArray();
    assertEquals(2, myObj.getSizeOfArrayJason());
    assertEquals(140, myObj.getMyElementJason(0));
    assertEquals(193, myObj.getMyElementJason(1));
  }
  
  @Test
  public void juanCarlosTest()
  {
    myArray jcObj =  new myArray();
    assertEquals(4,jcObj.getSizeofArrayjuanCarlos());
    assertEquals(1,jcObj.getMyElementjuanCarlos(0));
    assertEquals(6,jcObj.getMyElementjuanCarlos(1));
    assertEquals(8,jcObj.getMyElementjuanCarlos(2));
    assertEquals(3,jcObj.getMyElementjuanCarlos(3));
  }
  
  @Test
  public void bilguundalaiTest()
  {
    myArray myObj = new myArray();
    assertEquals(3, myObj.getSizeOfArrayBilguundalai());
    assertEquals("Yes", myObj.getMyElementBilguundalai(0));
    assertEquals("No", myObj.getMyElementBilguundalai(1));
    assertEquals("JutsuMeister1008", myObj.getMyElementBilguundalai(2));
    
  }

  
  public void haYeonTest()
  {
    myArray myObj = new myArray();
    assertEquals(0, myObj.getSizeOfArrayhaYeon());
  }
      @Test
  public void testArrayManal(){
    myArray a = new myArray();
    assertEquals(5, a.sizeOfArrayManal());
    
  }
  

      
  @Test
  public void hannahTest()
  {
    myArray myObj = new myArray();
    assertEquals(3, 1, myObj.getSizeOfArrayHannah());
    assertEquals(2.5, 1, myObj.getMyElementHannah(0));
    assertEquals(4.6, 1, myObj.getMyElementHannah(1));
    assertEquals(9.1,1, myObj.getMyElementHannah(2));
  }
  
  
}

