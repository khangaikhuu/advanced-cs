
/**
 * Here is my conditionals IF ELSE
 *
 * @author (Sung Min)
 * @version (042019)
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
            return "Number one is bigger";
        }
        else if (num2 > num1)
        {
            return "Number two is bigger";
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
        else if (a > c)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
