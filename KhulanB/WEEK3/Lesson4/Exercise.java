
/**
 * Write a description of class Exercise here.
 *
 * @author (khulan)
 * @version (06.09.19)
 */
public class Exercise
{
    private int [] myIntegerArray = {2,4,6,8,10,12,14};
    int sum = 0;
    public int calculateMySum()
    {
  
        for(int i = 0; i< myIntegerArray.length; i++)
        {
            sum = sum + myIntegerArray[i];
        }
        return sum;
    }
}
