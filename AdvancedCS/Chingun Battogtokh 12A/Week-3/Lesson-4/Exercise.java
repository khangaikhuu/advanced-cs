
/**
 * Write a description of class Exercise here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exercise
{
    private int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private int sum= 0;
    public int sumOfArray()
    {
        for(int i = 0; i< myArray.length-1; i++)
        {
            sum = sum + myArray[i];
        }
        return (sum);
    }
}

