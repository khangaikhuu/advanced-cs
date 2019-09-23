
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExerciseOneTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ExerciseOneTest
{
    @Test
    public void test(){
        ExerciseOne a = new ExerciseOne();
        ExerciseOne b = new ExerciseOne();
        
        int[] unsorted = {4, 3, -1, 5};
        int[] sorted = {-1, 3, 4, 5};
        
        assertArrayEquals(sorted, ExerciseOne.bubbleSort(unsorted));
        
        assertEquals(0, a.fibo(0));
        assertEquals(1, a.fibo(1));
        assertEquals(1, a.fibo(2));
        assertEquals(2, a.fibo(3));
        assertEquals(34, a.fibo(9));
        
        assertEquals(1, a.powerOf10(0));
        assertEquals(100, a.powerOf10(2));
        assertEquals(1000, a.powerOf10(3));
        assertEquals(10000000, a.powerOf10(7));
        
        assertEquals(1, a.sum(1));
        assertEquals(3, a.sum(2));
        assertEquals(6, a.sum(3));
        assertEquals(10, a.sum(4));
        assertEquals(15, a.sum(5));
    }
}
