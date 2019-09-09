
/**
 * Write a description of class sumClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sumClass
{
    private int sum = 0;
    public int getSum()
    {
        return sum;
    }
    
    public int addGlobalSum(int num)
    {
        sum+=num;
        return sum;
    }
    
    public int addLocalSum(int num)
    {
        int sum = 5;
        return sum + num;
    }
}
