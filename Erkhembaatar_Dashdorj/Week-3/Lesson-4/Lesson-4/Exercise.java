
/**
 * Write a description of class Exercise here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exercise
{
    private int[] arry = {1,5,1,6,2,6,8,2,7,12134};
    private int sum= 0;
    public int calculateArry()
    {
        for(int i = 0; i<arry.length; i++)
        {
            sum+= arry[i];
        }
        System.out.println(sum);
        return (sum);
    }
    
}
