import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class OrganizeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class InsertionTest
{
   @Test
   public void testInsertion()
   {
       Insertion i1 = new Insertion();
       int array[] = {3,1,2,3,8};
       i1.getInsertion(array);
    }
}
