
/**
 * Here is my conditionals If ElSE
 *
 * @author (your name)
 * @version (a version number or a date)
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
        else if (a > c)
        {
            return false;
        }
        else
        {
            return false;
        }
    }
    
}
