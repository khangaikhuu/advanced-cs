
/**
 * Write a description of class Exercise here.
 *
 * @author (Bilguundalai)
 * @version (06/09/2019)
 */
public class Exercise
{
    private int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    private int sum= 0;
    public int sumOfArray()
    {
        for(int i = 0; i<myArray.length; i++)
        {
            sum+= myArray[i];
        }
        return (sum);
    }
}
