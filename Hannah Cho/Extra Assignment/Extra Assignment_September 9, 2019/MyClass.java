
/**
 * Write a description of class MyClass here.
 *
 * @author (Hannah
 * @version (09.09.2019)
 */
public class MyClass
{
    private int[] myArray = {1,2,3,4,5};
    private double[] secondArray = {1.0,2.3,4.7,5.8};
    private int sum = 0;
    private int quotient;
    public int getSum()
    {
      for(int i = 0; i < myArray.length - 1; i++)
      {
         sum = sum + myArray[i]; 
        }
      return (sum);
    }
    public int getQuotient()
    {
      for(int i = 0; i < myArray.length; i++)
      {
          quotient = quotient * myArray[i];
        }
      return (quotient);
    }
    public double maxValue()
    {
       
    }
    public double minValue()
    {
        
    }
}
