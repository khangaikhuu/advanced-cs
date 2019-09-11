
/**
 * Write a description of class ExtraAssignment here.
 *
 * @author (Erkhem)
 * @version (9/9/19)
 */
public class ExtraAssignment
{
   public int sumOfArry(int[] arry)
   {
       int sum = 0;
       for( int i: arry)
       {
           sum+=i;
        }
        return sum;
   }
   
   public int productOfArry(int[] arry)
   {
       int sum=1;
       for(int i : arry)
       {
           sum*=i;
        }
        return sum;
   }
   
   public double maxOfArry(double[] array)
   {
     double chosen = -1;
     for(int i=0 ; i<array.length ; i++)
     {
         if (chosen <= array[i])
         {
             chosen = array[i];
         }
     }
     return chosen;
    }
    public double minOfArry(double[] arry)
    {
     double chosen = 0;
     for(int i=0; i<arry.length-1 ; i++)
     {
         if(arry[i+1]<arry[i])
         {
             chosen = arry[i+1];
         }
         else
         {
               chosen = arry[i];
         }
        
     }
     return chosen;
    }
    
}
