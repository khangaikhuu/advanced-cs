

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExerciseTwoTest.
 *
 * @author  (Hannah)
 * @version (a version number or a date)
 */
public class ExerciseTwoTest
{
    @Test
    public void testMyMethod()
    {
        ExerciseTwo ex2 = new ExerciseTwo();
        assertEquals(0, ex2.fibonnaci(0)); 
        assertEquals(1, ex2.fibonnaci(1));
        assertEquals(1, ex2.fibonnaci(2));
        assertEquals(2, ex2.fibonnaci(3));
        assertEquals(34, ex2.fibonnaci(9));
        
        ExerciseTwo ex3 = new ExerciseTwo();
        assertEquals(1, ex3.powerOf10(0));
        assertEquals(1, ex3.powerOf10ForLoop(0));
        
        assertEquals(10, ex3.powerOf10(1));
        assertEquals(10, ex3.powerOf10ForLoop(1));
        
        assertEquals(100, ex3.powerOf10(2));
        assertEquals(100, ex3.powerOf10ForLoop(2));
        
        assertEquals(1000, ex3.powerOf10(3));
        assertEquals(1000, ex3.powerOf10ForLoop(3));
        
        assertEquals(1000000, ex3.powerOf10(6));
        assertEquals(10000000, ex3.powerOf10(7));
        
        ExerciseTwo ex4 = new ExerciseTwo();
        assertEquals(-1, ex4.sum(-1));
        assertEquals(1, ex4.sum(1));
        assertEquals(3, ex4.sum(2));
        assertEquals(6, ex4.sum(3));
        assertEquals(10, ex4.sum(4));
    }
}
