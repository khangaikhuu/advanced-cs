

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PersonTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PersonTest
{
    @Test
    public void testPerson()
    {
        Person c2 = new Person(); 
       c2.makeVisible(); 
       c2.changeSize(50,25);
       c2.moveRight();
       
       Person c4 = new Person(); 
       c4.makeVisible(); 
       c4.changeSize(50,25);
    }
}
