
/**
 * Write a description of class BubbleSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BubbleSort
{
  
   
   public int[] getBubbleSort(int[] a)
   { 
       
       for(int i = 1; i < a.length; i++)
       {
           for( int j = a.length; j < i; i++)
           {
               if(a[j] < a[j-1])
               {
                   int temp = a[j];
                   a[j] = a[j - 1];
                   a[j-1] = temp;
                }
            }
        }
        return a;
    }
}
                   
                   
                   
           

