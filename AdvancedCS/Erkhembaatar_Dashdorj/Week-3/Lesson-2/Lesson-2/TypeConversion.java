
/**
 * Write a description of class TypeConversion here.
 *
 * @author (Erkhem)
 * @version (1.0)
 */
public class TypeConversion
{
 
    
    
    private int a = 10;
    private double b;
    
    public int getA()
    {
        return a;
    }
    
    public double getB()
    {
        return b;
    }
    
    public void convertB(int num)
    {
        b = (double)num;
    }
    
    public double getTwoIntegers(int x, int y)
    {
        return (double)(x+y);
    }
}
    
