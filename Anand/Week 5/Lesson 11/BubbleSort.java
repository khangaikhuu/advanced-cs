
/**
 * Write a description of class BubbleSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BubbleSort
{
    public int[] sort(int[]a)
    {
        for(int i = 0; i < a.length; i++ )
        {
            for(int j = i; j > 0; j--)
            {
                if(a[j] < a[j - 1])
                {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
                
            }
        }
        return a;
    }
}
