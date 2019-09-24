

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
   public void personTest()
   {
       Person p1 = new Person();
       p1.moveRight();
       p1.makeVisible();
       
       Person p2 = new Person();
       p2.moveLeft();
       p2.makeVisible();
       p2.changeSize(40,20);
       p2.moveDown();
       
       
       
   }
}
