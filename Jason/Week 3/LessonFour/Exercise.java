
/**
 * Write a description of class Exercise here.
 *
 * @author (Jason)
 * @version (06.09.2019)
 */
public class Exercise
{
   private int [] myIntegerArray = {1, 4, 3, 4, 5, 6, 8, 10};
   int sum = 0;
   public int calculateMySum(int [] myArr)
  {
   for(int i = 0; i<myIntegerArray.length; i++)
    {
        sum = sum + myIntegerArray[i];
    }
        return (sum);
    }
}
    
