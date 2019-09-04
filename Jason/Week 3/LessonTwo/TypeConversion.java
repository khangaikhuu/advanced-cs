
/**
 * Write a description of class TypeConversion here.
 *
 * @author (Jason Lee)
 * @version (04.09.2019)
 */
public class TypeConversion
{
    private int a = 10;
    private double b;
    private int c = 69;
    public int getA()
    {
       return a; 
    }
    public double getB()
    {
        return b;
    }   
    public void convertA(int number)
    {
        b = (double) number;
    }
    public double convertSum(int a, int c)
    {
        return (double)(a + c); 
    }
}

