
/**
 * Write a description of class BubbleSort here.
 *
 * @author (Hayeon Lee)
 * @version (17/09/2019)
 */
public class BubbleSort
{
    
    
    public int[] sortBubble(int [] a)
    {
        for(int i = 0; i < a.length;i++)
        {
            for(int j = a.length -1; j < i; i--)
            {
                if (a[j] < a[j-1])
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
