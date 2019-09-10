
/**
 * Write a description of class ExerciseTwo here.
 *
 * @author (Jason)
 * @version (10.09.2019)
 */
public class ExerciseTwo
{
    public void ex1(String s)
    {
        String hello = "Hello"; 
        hello = hello.concat(s);
        System.out.println(hello);
    }
    
    private int a = 10;
    private int b = 5;
    
    public int getSum(int a, int b)
    {
        return a + b;
    }
    
    private int c = 50;
    private int d = 3;
    
    public int getQuotient(int c, int d)
    {
        return c / d; 
    }
    
    public int getCalc(int A, int B, int C, int D)
    {
        return -A + B * A + (C+D) % D - C + -A*A / D + A + C / A * 2 - D % A;
    }
    
    public void getMulti(int f)
    {
        for (int i = 1; i < 10; i ++)
        {
            System.out.println(i * f);
        }
    }
    
    public double getAvg(double z, double x, double p)
    {
        return (z + x + p) / 3;
    }
    
    private int y = 10;
    private int m = 20;
    
    public void swapNum(int y, int m)
    {
        int temp;
        temp = m;
        y = m;
        m = temp;
        System.out.println(y = m);
    }
}
