
/**
 * Here is my conditionals IF ELSE
 *
 * @author (Amina)
 * @version (09.04.2019)
 */
public class Conditionals
{
    private int a = 10;
    private int b = 20;
    private int c = 10;
    public String checkMaximumTwoNymbers(int num1, int num2)
    {
        if ( num1 > num2)
        {
            return "The Number one is bigger";
        }
        else if (num1 < num2)
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
        else if (a > b)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}
