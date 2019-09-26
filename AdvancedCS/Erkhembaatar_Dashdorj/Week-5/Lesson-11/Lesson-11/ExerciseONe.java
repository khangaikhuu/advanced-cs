import java.util.Arrays;
/**
 * Write a description of class ExerciseONe here.
 *
 * @author (Erkhem)
 * @version (9/17/2019)
 */
public class ExerciseONe
{
    public int[] bubbleSort(int[] a)
    {
        for(int i =0 ; i<a.length ; i++)
        {
            for(int j = a.length-1 ; j>i; j--)
            {
                if(a[j]<a[j-1])
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
