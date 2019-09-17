
/**
 * Write a description of class Sort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sort
{
   public int[] Sort(int[]a)
   {
       for(int i = 0; i < a.length;i++)
       {
           for(int j = i; j > 0; j--)
           {
               if(a[j - 1] > a [j])
               {
                   int temp = a[j - 1];
                   a[j - 1] = a [j];
                   a[j] = temp;
               }
               
           }
       }
       return a;
   }
}
