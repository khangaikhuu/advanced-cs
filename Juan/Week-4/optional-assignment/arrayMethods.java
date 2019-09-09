
/**
 * Write a description of class arrayMethods here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class arrayMethods
{

    
    public int intSum(int[] array)
    {
        int sum = 0;
        int arrayLength = array.length;
        for(int i=0;i<arrayLength;i++)
        {
            sum += array[i];
            System.out.println(sum);
        }
        return sum;
    }
    
    public int intProduct(int[] array)
    {
        int product = 0;
        int sum = 0;
        int arrayLength = array.length;
        for(int i=0;i<arrayLength;i++)
        {
            sum*= array[i];
        }
        return product;
    }
    
    public double doubleMax(double[] array)
    {
        double max = 0.0;
        int arrayLength = array.length;
        for(int i=0; i<arrayLength-1; i++)
        {
            if(array[i]>array[++i])
            {
                max = array[i];
            }
            else
            {
                max = array[++i];
            }
        }
        return max;
    }
    
    public double doubleMin(double[] array)
    {
        double min = 0.0;
        int arrayLength = array.length;
        for(int i=0; i<arrayLength-1; i++)
        {
            if(array[i]<array[++i])
            {
                min = array[i];
            }
            else
            {
                min = array[++i];
            }
        }
        return min;
    }
}
