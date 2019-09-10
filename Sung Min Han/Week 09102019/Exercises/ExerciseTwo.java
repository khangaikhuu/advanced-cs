
/**
 * Write a description of class ExerciseTwo here.
 *
 * @author (Sung Min)
 * @version (102019)
 */
public class ExerciseTwo
{
     public void ex2(String s)
    {
        String h = "Hello";
        h = h.concat(s);
        System.out.println(h);
    }
    
       public int getSum(int a, int b)
    {
        return a + b;
    }
    
      public int getDiv(int c, int d)
    {
        return c / d;
    }
    
    
    public int getOp(int a, int b, int c, int d)
    {
        return -a + b * a + (c+d) % d - c + -a*a / d + a + c / a * 2 - d % a;
    }
    
    public void getMult(int v)
    {
        for(int i = 1; i < 10; i++)
        {
            System.out.println(i * v);
        }
    }
    
    public double getAver(double a, double b, double c)
    {
        return (a + b + c) / 3;
    }
    
    private int x = 10;
    private int y = 20;
    public void swapVar(int x, int y)
    {
        int temp;
        
        y = x;
        temp = y;
        y = temp;
        
        System.out.println(x = y);
    }
}
