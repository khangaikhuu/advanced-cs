

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class LabClassTest.
 *
 * @author  (Anudari)
 * @version (25/09/19)
 */
public class LabClassTest
{
     @Test 
   public void testMyMethod()
   {
       LabClass advancedcomputerscience = new LabClass(15);
       Student anudari = new Student("anudari","123");
       Student hannah = new Student("hannah", "456");
       Student hayeon = new Student("hayeon", "877"); 
       Student khangarid = new Student("khangarid", "908"); 
       Student manal = new Student("manal", "756");
       Student Amina = new Student("Amina", "563");
       Student Chingun = new Student("Chingun", "450");
       Student Anand = new Student("Anand", "900");
       Student Tsengel = new Student("Tsengel", "750");
       Student Bilguundalai = new Student("Bilguundalai", "701");
       Student Khulan = new Student("Khulan", "412");
       Student Erkhembaatar = new Student("Erkhembaatar", "731");
       Student Juan = new Student("Juan", "340");
       Student Sungmin = new Student("Sungmin", "112");
       Student Jason = new Student("Jason", "531"); 
       
       advancedcomputerscience.enrollStudent(anudari);
       advancedcomputerscience.enrollStudent(hannah);
       advancedcomputerscience.enrollStudent(hayeon);
       advancedcomputerscience.enrollStudent(khangarid);
       advancedcomputerscience.enrollStudent(manal);
       advancedcomputerscience.enrollStudent(Amina);
       advancedcomputerscience.enrollStudent(Chingun);
       advancedcomputerscience.enrollStudent(Anand);
       advancedcomputerscience.enrollStudent(Tsengel);
       advancedcomputerscience.enrollStudent(Bilguundalai);
       advancedcomputerscience.enrollStudent(Khulan);
       advancedcomputerscience.enrollStudent(Erkhembaatar);
       advancedcomputerscience.enrollStudent(Juan);
       advancedcomputerscience.enrollStudent(Sungmin);
       advancedcomputerscience.enrollStudent(Jason);
       assertEquals(15, advancedcomputerscience.numberOfStudents());
    }
}
