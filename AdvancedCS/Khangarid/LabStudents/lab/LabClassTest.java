

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class LabClassTest
{
    @Test
    public void tester ()
    {
        LabClass ex = new LabClass(15);
        Student khangarid = new Student("Khangarid", "01");
        Student juan = new Student("Juan", "02");
        Student chingun = new Student("Chingun", "03");
        Student anand = new Student("Anand", "04");
        Student bill = new Student("BillGun", "05");
        Student manal = new Student("Manal", "06");
        Student anudari = new Student("Anudari", "07");
        Student hannah = new Student("Hannah Cho", "08");
        Student hayeon = new Student("Hayeon", "09");
        Student amina = new Student("Aminerdene", "10");
        Student erhem = new Student("Erhembaatar", "11");
        Student khulan = new Student("Khulan", "12");
        Student tsengel = new Student("Tsengel", "13");
        Student jason = new Student("Jason", "14");
        Student hansomin = new Student("Sung Min", "15");
        
        ex.enrollStudent(khangarid);
        ex.enrollStudent(juan);
        ex.enrollStudent(chingun);
        ex.enrollStudent(anand);
        ex.enrollStudent(bill);
        ex.enrollStudent(manal);
        ex.enrollStudent(anudari);
        ex.enrollStudent(hannah);
        ex.enrollStudent(hayeon);
        ex.enrollStudent(amina);
        ex.enrollStudent(erhem);
        ex.enrollStudent(khulan);
        ex.enrollStudent(tsengel);
        ex.enrollStudent(jason);
        ex.enrollStudent(hansomin);
        
        assertEquals(15, ex.numberOfStudents());
    }
}
