

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
    public void LabClassTest()
    {
        Student Juan = new Student("Juan","1");
        Student  K = new Student("Khulan","2");
        Student E = new Student("Erkhem","3");
        Student T = new Student("Tsengel","4");
        Student J = new Student("Jason","5");
        Student S = new Student("SungMin","6");
        Student H = new Student("Hayeon","7");
        Student Ha = new Student("Hannah","8");
        Student A = new Student("Anu","9");
        Student Kh = new Student("Khangarid","10");
        Student An = new Student("Anand","11");
        Student M = new Student("Manal","12");
        Student B = new Student("Bilguundalai","13");
        Student C = new Student("Chinguun","14");
        Student Am = new Student("Amina","15");
        LabClass lc = new LabClass(15);
        lc.enrollStudent(K);
        lc.enrollStudent(E);
        lc.enrollStudent(Am);
        lc.enrollStudent(Juan);
        lc.enrollStudent(C);
        lc.enrollStudent(Kh);
        lc.enrollStudent(An);
        lc.enrollStudent(Ha);
        lc.enrollStudent(H);
        lc.enrollStudent(S);
        lc.enrollStudent(J);
        lc.enrollStudent(A);
        lc.enrollStudent(M);
        lc.enrollStudent(B);
        lc.enrollStudent(T);
        assertEquals(15, lc.numberOfStudents());
       }
    }

