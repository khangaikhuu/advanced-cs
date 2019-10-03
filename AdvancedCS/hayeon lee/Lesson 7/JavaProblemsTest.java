

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class JavaProblemsTest.
 *
 * @author  (Hayeon Lee)
 * @version (11/09/2019)
 */
public class JavaProblemsTest
{
    @Test
    public void testJavaProblems()
    {
        JavaProblems one = new JavaProblems();
        one.getPositive(-1);
        one.maxNumber(25,78,87);
        one.getFloat(25);
        one.getWeekdays(3);
        one.getNaturalNumbers();
    }
    
}
