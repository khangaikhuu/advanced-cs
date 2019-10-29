
package LabStudents1;
import static org.junit.Assert.*;
import org.junit.After;

import org.junit.Before;
import org.junit.Test;

public class LabClassTest
{
    @Test
    public void test()
    {
        Student Anand = new Student("Anand", "1");
        Student Manal = new Student("Manal", "2");
        Student Bill = new Student("Bill", "3");
        Student Erkhemee = new Student("Erkhemee", "4");
        Student Chingun = new Student("Chingun", "5");
        Student Harry = new Student("Harry", "6");
        Student Anudari = new Student("Anudari", "7");
        Student Hana = new Student("Hana", "8");
        Student Lee = new Student("Lee", "9");
        Student Khulan = new Student("Khulan", "10");
        Student Amina = new Student("Amina", "11");
        Student Tsengel = new Student("Tsengel", "12");
        Student Juan = new Student("Juan", "13");
        Student Jason = new Student("Jason", "14");
        Student SungMin = new Student("SungMin", "15");
        LabClass L = new LabClass(15);
        L.enrollStudent(Anand);
        L.enrollStudent(Manal);
        L.enrollStudent(Bill);
        L.enrollStudent(Erkhemee);
        L.enrollStudent(Chingun);
        L.enrollStudent(Harry);
        L.enrollStudent(Anudari);
        L.enrollStudent(Hana);
        L.enrollStudent(Lee);
        L.enrollStudent(Khulan);
        L.enrollStudent(Amina);
        L.enrollStudent(Tsengel);
        L.enrollStudent(Juan);
        L.enrollStudent(Jason);
        L.enrollStudent(SungMin);
        assertEquals(15, L.numberOfStudents());
    }
}