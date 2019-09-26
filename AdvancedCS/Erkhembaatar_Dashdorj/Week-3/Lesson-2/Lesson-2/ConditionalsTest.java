

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ConditionalsTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ConditionalsTest
{
    @Test
    public void testCheckConditional()
    {
        Conditionals c1 = new Conditionals();
        assertEquals(false, c1.checkMax());
        assertEquals("pizza is bigger", c1.checkMax2Strings("pizza", "x"));
        assertEquals("pineapple is bigger", c1.checkMax2Strings("pineapple", "yseqwe"));
        assertEquals("alligator is bigger" , c1.checkMax2Strings("alligator", "crocs"));
        assertEquals("20 is bigger" , c1.checkMax2Numbers(10 , 20 ));
        assertEquals("10 is bigger" , c1.checkMax2Numbers(10 ,5 ));
        assertEquals("The numbers are equal" , c1.checkMax2Numbers(10,10));
    }
    
}
