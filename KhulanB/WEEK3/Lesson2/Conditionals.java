
/**
 * Here is my Conditionals IF ELSE.
 *
 * @author (Khulan)
 * @version (04.09.2019)
 */
public class Conditionals
{
    private int a = 10;
    private int b = 20;
    private int c = 10;
    public String checkMaximumTwoNumbers(int num1, int num2)
    {
        if (num1 > num2)
        {
            return "The number one is bigger";
        }
        else if(num1 < num2)
        {
            return "The number two is bigger";
        }
        else 
        {
            return "The numbers are equal";
        }
    }
    public boolean checkMaximum()
    {
     if (a > b)
      {
        return true;
      }
      else if( a > c)
      {
        return true;
      }
      else
      {
        return false;
      }
    }
}
