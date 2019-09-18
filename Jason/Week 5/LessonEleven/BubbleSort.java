
/**
 * Write a description of class BubbleSort here.
 *
 * @author (Jason)
 * @version (17.09.2019)
 */
public class BubbleSort
{
    public int[] bubbleSort(int[] array)
    {
        int n = array.length;
        int temp = 0;
        for (int i = 0; i < array.length; i++)
        {
            for (int j = n - 1; j > i; j--)
            {
                if (array [j] < array [j - 1])
                {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
