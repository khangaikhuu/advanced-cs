
/**
 * Write a description of class Exercise here.
 *
 * @author (Aminerdene)
 * @version (09.06.2019)
 */
public class Exercise
{
     private int [] myIntegerArray = {1, 4, 3, 4, 5,6, 8, 10};
    int sum = 0;
     public int calculateMySum()
    {
        for (int i = 0; i<myIntegerArray.length-1; i++)
        {
            sum = sum + myIntegerArray[i];
        }
        return (sum);
    }
}
