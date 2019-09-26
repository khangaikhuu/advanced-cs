
/**
 * Write a description of class ExerciseJava here.
 *
 * @author (Hannah)
 * @version (06.09.2019)
 */
public class ExerciseJava
{
    private int[] array = {1,4,3,4,3,5,6,8,10};
    private int sum = 0;
    
    public int calculateMySum()
    {
        for(int i = 0; i < array.length - 1; i++)
        {
            sum = sum + array[i];
        }
        return (sum);
    }
    }
