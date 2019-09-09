
/**
 * Write a description of class ExerciseOne here.
 *
 * @author (Erkhem)
 * @version (9/9/19)
 */
public class ExerciseOne
{
    private int sum = 0;
    
    public void addGlobalSum(int add)
    {
        sum+=add;
    }
    public int getSum()
    {
        return sum;
    }
    public int addLocalSum(int add)
    {
        int sum = 5;
        return sum+add;
    }
}
