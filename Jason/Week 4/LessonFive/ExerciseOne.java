
/**
 * Write a description of class ExerciseOne here.
 *
 * @author (Jason)
 * @version (09.09.2019)
 */
public class ExerciseOne
{
    private int sum = 0;
    
    public int getSum()
    {
        return sum;
    }
    public void addGlobalSum(int a)
    {
        sum = sum + a;
    }
    public int addLocalSum(int a)
    {
        int sum = 5;
        return sum + a;
    }
}
