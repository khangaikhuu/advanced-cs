

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class LabClassTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LabClassTest
{
   @Test
   public void testLabClass()
   {
       Student Tsengel = new Student("Tsengel", "11111");
       Student Jason = new Student("Jason", "22222");
       Student SungMin = new Student("SungMin", "33333");
       Student Khulan = new Student("Khulan", "44444");
       Student Amina = new Student("Amina", "55555");
       Student Erkhembayar = new Student("Erkhembayar", "66666");
       Student Hannah = new Student("Hannah", "77777");
       Student Anudari = new Student("Anudari", "88888");
       Student Hayeon = new Student("Hayeon", "99999");
       Student Khangarid = new Student("Khangarid", "10101");
       Student Chinguun = new Student("Tsengel", "12121");
       Student Juan = new Student("Tsengel", "13131");
       Student Anand = new Student("Tsengel", "14141");
       Student Manal = new Student("Tsengel", "15151");
       Student Bilguundalai = new Student("Tsengel", "16161");
       
       LabClass advComp = new LabClass(15);
       advComp.enrollStudent(Tsengel);
       advComp.enrollStudent(Jason);
       advComp.enrollStudent(SungMin);
       advComp.enrollStudent(Khulan);
       advComp.enrollStudent(Amina);
       advComp.enrollStudent(Erkhembayar);
       advComp.enrollStudent(Hannah);
       advComp.enrollStudent(Anudari);
       advComp.enrollStudent(Khangarid);
       advComp.enrollStudent(Chinguun);
       advComp.enrollStudent(Juan);
       advComp.enrollStudent(Hayeon);
       advComp.enrollStudent(Anand);
       advComp.enrollStudent(Manal);
       advComp.enrollStudent(Bilguundalai);
       
       
       assertEquals(15, advComp.numberOfStudents());
       
    }
}
