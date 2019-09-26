

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class classworkTest
{
    @Test
    public void testBubbleSort()
    {
        classwork as = new classwork();
        classwork as1 = new classwork();
        
        int[] unsortedArray = {4, 3, -1, 5};
        int[] sortedArray = {-1, 3, 4, 5};
        assertArrayEquals(unsortedArray, classwork.bubbleSort(unsortedArray));
        assertEquals(1, 1);
        
        assertEquals(0, as.fibonacci(0));
        assertEquals(1, as.fibonacci(1));
        assertEquals(1, as.fibonacci(2));
        assertEquals(2, as.fibonacci(3));
        assertEquals(34, as.fibonacci(9));
        
        classwork as2 = new classwork();
        assertEquals(1, as2.power(0));
        assertEquals(1, as2.powerLoop(0));
        
        assertEquals(10, as2.power(1));
        assertEquals(10, as2.powerLoop(1));
        
        assertEquals(100, as2.power(2));
        assertEquals(100, as2.powerLoop(2));
        
        assertEquals(1000, as2.power(3));
        assertEquals(1000, as2.powerLoop(3));
        
        assertEquals(10000000, as2.power(7));
        assertEquals(10000000, as2.powerLoop(7));
        
        classwork as3 = new classwork();
        assertEquals(10, as3.sum(4));
        assertEquals(6, as3.sum(3));
        assertEquals(3, as3.sum(2));
        assertEquals(1, as3.sum(1));
        assertEquals(15, as3.sum(5));
    }
}
