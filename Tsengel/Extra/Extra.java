/**
 * Write a description of class Extra here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Extra
{ 
   
   public int getSum(int[] ar)
   {
       int sum = 0;
       for(int i = 0; i < ar.length ; i++)
       {
           sum = sum + ar[i];
        }
       return sum;
    }
   
   public int getMultiplication(int[] arr)
   {
       int sum = 0;
       for(int i = 0; i < arr.length ; i++)
       {
           sum = sum * arr[i];
        }
       return sum;
    }
   
}
