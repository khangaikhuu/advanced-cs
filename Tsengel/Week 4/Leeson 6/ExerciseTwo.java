
/**
 * Write a description of class ExerciseTwo here.
 *
 * @author (Tsengel)
 * @version (10.09.2019)
 */
public class ExerciseTwo
{
    public void changeOutput(String a)
    {
        String name = "Hello";
        name = name.concat(a);
        System.out.println(a);
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
    
    public int getCalculation(int A, int B, int C, int D)
    {
        return -A + B * A + (C+D) % D - C + -A*A / D + A + C / A * 2 - D % A;
    }
    
    public void getMultiplication(int x)
    {
        for (int i = 1; i < 10; i++)
        {
            System.out.println(i * x);
        }
    }
    
    private double q = 10.0;
    private double w = 20.0;
    private double e = 30.0;
    public double getAverage(double q, double w, double e)
    {
        return q + w + e / 3;
    }
    
    private int r = 10;
    private int t = 20;
    public void changeNum(int r, int t)
    {
        int temp;
        temp = t;
        r = t;
        t = temp;
        System.out.println(r = t);
    }
}