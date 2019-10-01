
/**
 * Write a description of class ExerciseTwo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExerciseTwo
{
    public void main(String s)
    {
        String k = "Hello";
        k = k.concat(s);
        System.out.println(s);
    }
    private int a = 10;
    private int b = 5;
    public int getSum()
    {
       int sum = a + b;
       return sum;
    }
    private int d = 50;
    private int e = 3;
    public int getDivision()
    {
        int quotient = d/e;
        return quotient;
    }
    public int getCalculations(int A, int B, int C, int D)
    {
       return -A + B * A + (C+D) % D - C + -A*A / D + A + C / A * 2 - D % A;
    }
    public void getMultiplication(int x)
    {
        for(int i = 1; i < 10; i++)
        {
            System.out.println(i*x);
        }
    }
    public double getAverage(double x, double y, double z)
    {
        return (x + y + z)/3;
    }
    public void swapVariable(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }
}


