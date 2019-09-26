
/**
 * Here is my conditionals IF ELSE.
 *
 * @author (Hannah)
 * @version (04.09.2019)
 */
public class Conditionals
{
   private int a = 10;
   private int b = 20;
   private int c = 10;
   
   public boolean checkMax()
   {
     if (a > b)
     {
         return true;
        }
     else if (a > c)
     {
         return false;
        }
     else 
     {
         return false;
        }
    }
   
     public String checkMaximumTwoNumbers(int num1, int num2)
   {
       if (num1 > num2)
       {
           return "Number one is bigger";
        }
       else if (num1 == num2)
        {
            return "The Numbers are equal";
        }
        else 
        {
            return "Number two is bigger";
        }
    }
}
