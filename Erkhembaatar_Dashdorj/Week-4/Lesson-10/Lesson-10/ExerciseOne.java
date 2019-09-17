
/**
 * Write a description of class ExerciseOne here.
 *
 * @author (Erkhem)
 * @version (1.0)
 */
public class ExerciseOne
{
   private int[]a = {5,4,3,2,1};
   public void sort()
   {
       for(int i = 0; i<a.length; i++)
       {
           for(int j = i ; j>0 ; j--)
           {
               if(a[j-1]>a[j])
               {
                   int temp = a[j-1];
                   a[j-1]=a[j];
                   a[j]=temp;
               }
           }
    
        }
    }   
   public int[] getSort()
   {
       return a;
    }
}
