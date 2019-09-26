
/**
 * 
 *
 * @author (khangarid)
 * @version (04.09.2019)
 */
public class type_conversion
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
    
    public void convertA(int number)
    {
        b = (double) number;
    }
    
    public double sumNums(int num1, int num2)
    {
        return (double) (num1 + num2);
    }
}
