
/**
 * Write a description of class insertionSort here.
 *
 * @author (Bilguundalai)
 * @version (16/9/2019)
 */
public class array
{
    public int[] Sort(int[] a)
    {
        int temp = 0;
        for (int i = 0; i < a.length; i++)
        {
            for(int j = i; j > 0; j--)
            {
               if(a[j-1] > a[j])
               {
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
               }
                else
               {
                    break;
               }
           
            }
        }
        return a;
    }
}

    
        
            

