

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class InsertionSortTest.
 *
 * @author  (Jason)
 * @version (16.09.2019)
 */
public class InsertionSortTest
{
    @Test
    public void testIntertionSort()
    {
        InsertionSort is = new InsertionSort();
        int array[] = {1,5,7,8,3,2};
        is.insertionSort(array, array.length);
    }
}
