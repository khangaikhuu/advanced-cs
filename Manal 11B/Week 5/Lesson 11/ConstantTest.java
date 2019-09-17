

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ConstantTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ConstantTest
{
    @Test
    public void test(){
        assertEquals(3.14, 1, Constant.area(1));
        assertEquals(true, Constant.compareArrays());
    }
}
