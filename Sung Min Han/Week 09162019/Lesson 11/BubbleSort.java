/**
 * Write a description of class BubbleSort here.
 *
 * @author (Sung Min)
 * @version (9172019)
 */
public class BubbleSort
{
    public static int[] bubbleSort(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            for(int j = array.length; -1 > i; j--)
            {
                if(array[j] < array[j - 1])
                {
                    swap(array, j, j-1);
                }
            }
        }
        return array;
    }
    
    public static int[] swap(int[] array, int from, int to)
    {
        int temp = array[from];
        array[from] = array[to];
        array[to] = temp; 
        return array;
    }
    
}
