
/**
 * Write a description of class ExerciseTwo here.
 *
 * @author (Hayeon Lee)
 * @version (10/09/2019)
 */
public class ExerciseTwo
{
    private double A = 10.0;
    private double B = 20.0;
    private double C = 30.0;
   public static void main(String args[])
   {
       String s = "Hello";
       s = s.concat("Mr.Khangai");
       System.out.println(s);
    }
   public int getSum(int a, int b)
   {
       return a + b;
    }
    public double getDivision(int c, int d)
    {
        return c / d;
    }
    public int getOperations(int a, int b, int c, int d)
    {
        return -a + b * a + (c + d) % d - c + -a*a/d + a + c / a*2 - d % a;
    }
    public void getMultiple(int f)
    {
        
        for(int i = 1; i < 10; i++)
        {
            System.out.println(i * f);
        }
    }
    public double getAverage(double A, double B, double C)
    {
        return (A + B + C)/ 3;
        
    }
}
