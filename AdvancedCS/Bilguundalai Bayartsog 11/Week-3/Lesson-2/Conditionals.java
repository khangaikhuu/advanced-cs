
/**
 * Here is my conditions IF ELSE
 *
 * @author (Bilguundalai)
 * @version (0.4.09.2019)
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
            return "The Number one is bigger";
        }
        else if (num2 > num1)
        {
            return "The Number two is bigger";
        }
        else
        {
            return "The Numbers are equal";
        }
    
   }
   
    public boolean checkMaximum()
    {
        if (a > b)
        {
            return true;
        }
        else if(a > c)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
