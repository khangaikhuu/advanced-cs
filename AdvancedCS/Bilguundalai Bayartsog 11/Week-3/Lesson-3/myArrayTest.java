

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MyArrayTest.
 *
 * @author  (Bilguundalai )
 * @version (0.5/0.9/2019)
 */
public class myArrayTest
{
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
  @Test
    public void MyTsengelTest()
    {
        MyArray myObj = new MyArray();
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
    MyArray myObj = new MyArray();
    assertEquals(3, myObj.getSizeOfArrayKhangarid());
    assertEquals(3.22f, myObj.getMyElementKhangarid(0));
    assertEquals(7.22f, myObj.getMyElementKhangarid(1));
    assertEquals(11.22f, myObj.getMyElementKhangarid(2));  
    assertEquals(15.22f, myObj.getMyElementKhangarid(3));   
    assertEquals(19.22f, myObj.getMyElementKhangarid(3));   
  }
  
  public void msAmina()
  {
    MyArray myObj = new MyArray();
    assertEquals(4, myObj.getSizeOfArrayMsAmina());
  }
  @Test
  public void khulanTest()
  {
    MyArray myObj = new MyArray();
    assertEquals(4, myObj.getSizeOfArrayKhulan());
    assertEquals(1.2, myObj.getMyElementKhulan(0));
    assertEquals(2.9, myObj.getMyElementKhulan(1));
    assertEquals(3.4, myObj.getMyElementKhulan(2));
    assertEquals(4.6, myObj.getMyElementKhulan(3));
  }
  @Test
  public void erkhemTest()
  {
    //private String[] erhkem = {"3", "2", "32", "hi", "P"};
    //getSizeOfArrayErkhem
    
    MyArray erkObj = new MyArray();
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
    MyArray myObj = new MyArray();
    assertEquals(2, myObj.getSizeOfArrayJason());
    assertEquals(140, myObj.getMyElementJason(0));
    assertEquals(193, myObj.getMyElementJason(1));
  }
  
  @Test
  public void juanCarlosTest()
  {
    MyArray jcObj =  new MyArray();
    assertEquals(4,jcObj.getSizeofArrayjuanCarlos());
    assertEquals(1,jcObj.getMyElementjuanCarlos(0));
    assertEquals(6,jcObj.getMyElementjuanCarlos(1));
    assertEquals(8,jcObj.getMyElementjuanCarlos(2));
    assertEquals(3,jcObj.getMyElementjuanCarlos(3));
  }
  
  @Test
  public void bilguundalaiTest()
  {
    MyArray myObj = new MyArray();
    assertEquals(3, myObj.getSizeOfArrayBilguundalai());
    assertEquals("5", myObj.getMyElementBilguundalai(0));
    assertEquals("4", myObj.getMyElementBilguundalai(1));
    assertEquals("Jutsumeister", myObj.getMyElementBilguundalai(2));
    
  }
 
  public void haYeonTest()
  {
    MyArray myObj = new MyArray();
    assertEquals(0, myObj.getSizeOfArrayhaYeon());
  }
  
    @Test 
    public void anudariTest()
    {
       
        MyArray myObj = new MyArray();
        assertEquals(4, myObj.getSizeOfArrayAnudari());
        assertEquals(3, myObj.getMyElementAnudari(0));
        assertEquals(4, myObj.getMyElementAnudari(1));
        assertEquals(7, myObj.getMyElementAnudari(2));
        assertEquals(9, myObj.getMyElementAnudari(3));
    }
      
  @Test
  public void hannahTest()
  {
    MyArray myObj = new MyArray();
    assertEquals(3, myObj.getSizeOfArrayHannah());
    assertEquals(2.5, myObj.getMyElementHannah(0));
    assertEquals(4.6, myObj.getMyElementHannah(1));
    assertEquals(9.1, myObj.getMyElementHannah(2));
  }
  
  
}
    
  @Test
  public void testArrayManal(){
    MyArray a = new MyArray();
    assertEquals(5, a.sizeOfArrayManal());
    assertEquals(1.1, 1, a.getMyElementManal(0));
    assertEquals(1.2, 1, a.getMyElementManal(1));
    assertEquals(1.3, 1, a.getMyElementManal(2));
    assertEquals(1.4, 1, a.getMyElementManal(3));
    assertEquals(1.5, 1, a.getMyElementManal(4));
  }
  
}
   
 
