
/**
 * Write a description of class BubbleSort here.
 *
 * @author (Bilguundalai)
 * @version (17.09.2019)
 */
public class BubbleSort
{
    public static int[] sort(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            for(int j = i; j > 0; j--)
            {
                if(a[j] < a[j-1])
                {
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }
        return a;
    }
}
