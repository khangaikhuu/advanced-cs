
/**
 * Write a description of class ExerciseOne here.
 *
 * @author (Amina)
 * @version (2019.09.09)
 */
public class ExerciseOne
{
    private int sum = 0;
    public void addGlobalSum(int a)
    {
        sum = sum + a;
    }
    public int addLocalSum(int a)
    {
        int sum = 5;
        return sum + a;
    }
    public int getSum()
    {
        return sum;
    }
}
