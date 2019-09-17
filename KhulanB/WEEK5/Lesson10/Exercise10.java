
/**
 * Write a description of class Exercise10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exercise10
{
    public void insertionSort(int ar[])
    {
        
        for(int i = 0; i < ar.length; i++)
        {
            int temp = ar[i];
            int j = i;
            while(j > 0 && temp < ar[j-1])
            {
                ar[j] = ar[j-1];
                j = j -1;
            }
            ar[j] = temp;
        }
        
        for (int i = 0; i < ar.length; i++)
        {
            System.out.println(ar[i]);
        }
    }
}

