import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class InsertionSortTest.
 *
 * @author  (Sung Min)
 * @version (9162019)
 */
public class InsertionSortTest
{
    @Test
    public void testInsertionSort()
    {
        InsertionSort is = new InsertionSort();
        int array[] = {1, 5, 3, 6, 2};
        is.insertionSort(array, array.length);
    }
}
