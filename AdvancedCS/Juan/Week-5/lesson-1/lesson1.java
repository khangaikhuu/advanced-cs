import java.util.Arrays;
/**
 * Write a description of class lesson1 here.
 *
 * @author (Juan)
 * @version (17.09.2019)
 */
public class lesson1
{
    private int a = 5;
    private int b = 6;
    private final static double  PI= 3.14;//static constant
    private int[] array1 = {2,1,3};
    private int[] array2 = {2,1,3};
    
    public boolean compareArrays()
    {
        if(Arrays.equals(array1,array2))
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
        return PI*radius*radius;
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