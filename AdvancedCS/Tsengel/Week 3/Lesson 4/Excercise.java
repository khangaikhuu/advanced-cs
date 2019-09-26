
/**
 * Write a description of class Excersice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Excercise
{
   private int [] myIntegerArray = {1,2,3,4,5,6,7,8,10};
   private int sum = 0;
   public int calculateMySum()
   {
       for (int i = 0; i <  myIntegerArray.length; i++)
     {
       sum = sum + myIntegerArray[i];
     }
       return (sum);
    }
}
 
