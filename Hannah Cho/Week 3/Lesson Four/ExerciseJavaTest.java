

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExerciseJavaTest.
 *
 * @author  (Hannah)
 * @version (06.09.2019)
 */
public class ExerciseJavaTest
{
    @Test
    public void testMyMethod()
    {
        ExerciseJava ej = new ExerciseJava();
        assertEquals(34, ej.calculateMySum());
    }
}
