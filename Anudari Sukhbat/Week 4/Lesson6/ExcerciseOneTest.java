

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExcerciseOneTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ExcerciseOneTest
{
    @Test 
    public void TestA()
    {
        ExcerciseOne one = new ExcerciseOne();
        one.changeA();
        assertEquals("Hello World", one.getA());
        one.conditionals();
        
        
}
}
