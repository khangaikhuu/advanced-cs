
/**
 * Write a description of class Exercise here.
 *
 * @author (Sung Min)
 * @version (062019)
 */
public class Exercise
{
    private int [] sungMinIntArray = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    private int sum = 0;
    
    public int calculateMySum(int [] sungMinIntArray)
    {
        for(int i = 0; i<sungMinIntArray.length-1; i++)
        {
            sum = sum + sungMinIntArray[i];
        }
        return (sum);
    }
}
