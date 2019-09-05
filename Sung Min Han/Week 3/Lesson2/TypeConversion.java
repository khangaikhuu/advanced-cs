
/**
 * Write a description of class TypeConversion here.
 *
 * @author (Sung Min)
 * @version (042019)
 */
public class TypeConversion
{
    private int a = 10;
    private double b;
    private int c = 2;
    
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
    
    public double addNum(int a, int c)
    {
        return (double)(a + c);
    }
}
