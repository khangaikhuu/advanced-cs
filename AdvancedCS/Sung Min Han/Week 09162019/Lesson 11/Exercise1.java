import java.util.Arrays;
/**
 * Write a description of class Exercise1 here.
 *
 * @author (Sung Min)
 * @version (9172019)
 */
public class Exercise1
{
    private int a = 5;
    private int b= 6;
    private final static double PI = 3.14;
    private int[] arrayOne = {1, 2, 3};
    private int [] arrayTwo = {1, 2, 3};
    
    public boolean compareArrays()
    {
        if (Arrays.equals(arrayOne, arrayTwo))
        {
            return true; 
        }
        else
        {
            return false;
        }
    }
    
    
    public static double getArea(double radius)
    {
        double area = PI * radius * radius;
        return area;
    }
    
    public void changeA(int par1, int par2)
    {
        a = par1;
        b = par2;
    }
    
    public void changeA(int par1)
    {
        a = par1;
    }
    
    public int getA()
    {
        return a;
    }
    
}
