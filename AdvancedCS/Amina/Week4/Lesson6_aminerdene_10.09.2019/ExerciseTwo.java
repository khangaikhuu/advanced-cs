
/**
 * Write a description of class ExerciseTwo here.
 *
 * @author (Amina)
 * @version (10.09.2019)
 */
public class ExerciseTwo
{
    public void main(String s)
    {
        String a = "Hello "; 
        a = a.concat(s);
        System.out.println(a);
    }
    private int a = 10;
    private int b = 5;
    public int getSum()
    {
        int sum = a + b;
        return sum;
    }
    private int c = 50;
    private int d = 3;
    public int getDivision()
    {
        int division = c / d;
        return division;
    }
    public int getCalculations (int A,int B, int C, int D)
    {
        int calculations = -A + B * A + (C+D) % D - C + -A*A / D + A + C / A * 2 - D % A;
        return calculations;
    }
    public void getMultiplications (int x)
    {
        for(int i = 1; i < 10; i++)
     
        {
            System.out.println(i*x);
        }
    }

    public double getAverage(double e, double f, double g)
    {
        return (e + f + g) / 3;
    }
    private int t = 10;
    private int h = 20;
    public int getSwap()
    {
        t = t + h;
        h = t - h;
        t = t - h;
        return a = b;
    }
    
}

