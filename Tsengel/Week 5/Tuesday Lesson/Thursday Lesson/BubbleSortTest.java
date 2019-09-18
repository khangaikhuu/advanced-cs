import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

/**
 * The test class BubbleSortTest.
 *
 * @author (Tsengel)
 * @version (17.09.2019)
 */
public class BubbleSortTest
{
  @Test
  public void testBubbleSort()
  {
      BubbleSort b1 = new BubbleSort();
      int[] array = {1,3,2,5};
      int[] SortedArray = {1,2,3,5};
      assertEquals(true, Arrays.equals(b1.bubbleSort(array), SortedArray));
    }
}
