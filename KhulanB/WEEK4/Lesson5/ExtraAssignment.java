
/**
 * Write a description of class ExtraAssignment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExtraAssignment
{
  
    public int getSum(int[] arr)
    {
       int sum = 0;
       for(int i = 0; i < arr.length; i++)
       {
           sum = sum + arr[i];
        }
       return sum;
    }
    public int getMultiplication(int[] arr)
    {
       int sum = 0;
       for(int i = 0; i < arr.length; i++)
       {
           sum = sum * arr[i];
        }
       return sum;
    }
}
