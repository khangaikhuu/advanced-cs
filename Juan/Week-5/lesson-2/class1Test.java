

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class class1Test.
 *
 * @author  (Juan)
 * @version (a version number or a date)
 */
public class class1Test
{
    @Test
    public void testBubbleSort()
    {
        class1 ex = new class1();
        class1 ex1 = new class1();
        int [] unsortedArray = {5,4,7,2,8};
        int [] sortedArray = {2,4,5,7,8};
        assertArrayEquals(sortedArray,class1.bubbleSort(unsortedArray));
        int [] swappedArray = {4,2,5,7,8};
        assertArrayEquals(swappedArray, class1.swap(unsortedArray,0,1));
        
        ex.bubbleSort(unsortedArray);
        ex1.swap(unsortedArray,0,1);
        assertEquals(0,ex.fibonacci(0));
        assertEquals(1,ex.fibonacci(1));
        assertEquals(1,ex.fibonacci(2));
        assertEquals(2,ex.fibonacci(3));
        assertEquals(34,ex.fibonacci(9));
        
        assertEquals(1,ex1.powerOf10(0));
        assertEquals(10,ex1.powerOf10(1));
        assertEquals(100,ex1.powerOf10(2));
        assertEquals(1000,ex1.powerOf10(3));
        assertEquals(10000000,ex1.powerOf10(7));
        assertEquals(1,ex1.powerOf10ForLoop(0));
        assertEquals(10,ex1.powerOf10ForLoop(1));
        assertEquals(1000,ex1.powerOf10ForLoop(3));
        
        class1 ex2 = new class1();
        assertEquals(3,ex2.sum(2));
    }
}
