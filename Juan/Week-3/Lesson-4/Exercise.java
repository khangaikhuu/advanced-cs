
/**
 * Write a description of class Exercise here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exercise
{
   private int []juansIntArray = {45,85,6,4,7,9,2,79};
   int sum;
   int arrayLength = juansIntArray.length;
   public int calculateArraySumJuan()
   {
       
       for(int i=0; i<=arrayLength-1; i++)
       {
           
           sum += juansIntArray[i];
        }
        return sum;
    }
}
