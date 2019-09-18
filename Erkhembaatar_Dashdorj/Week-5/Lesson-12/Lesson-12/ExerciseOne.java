
/**
 * Write a description of class ExerciseOne here.
 *
 * @author (Erkhem)
 * @version (9/18/2019)
 */
public class ExerciseOne
{
    public static int[] bubbleSort(int[] a)
    {
        for( int i = 0; i <a.length ; i++)
        {
            for(int j = a.length -1; j>i ; j--)
            {
                if(a[j] <a[j-1])
                {
                    swap(a , j , j-1);
                }
            }    
        }
        return a; 
    }
    
    public static void swap(int[] a , int b , int c)
    {
        int temp = a[c];
        a[c] = a[b];
        a[b] = temp;
    }
    
    public static int sum(int n)
    {
        if(n>=1)
        {
            return sum(n-1) + n;
        }
        else
        {
            return n;
        }
    }
    
    public static int fibonnaci(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return fibonnaci(n-1)+fibonnaci(n-2);
    }
}
