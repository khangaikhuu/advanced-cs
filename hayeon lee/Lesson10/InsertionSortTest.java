

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class InsertionSortTest.
 *
 * @author  (Hayeon Lee)
 * @version (16/09/2019)
 */
public class InsertionSortTest
{
    @Test
    public void testSort()
    {
        InsertionSort sort = new InsertionSort();
        int [] a = {7,8,5,2,4,6,3};
        sort.insertSort(a);
}
}
