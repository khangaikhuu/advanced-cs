
/**
 * Write a description of class ExerciseTwo here.
 *
 * @author (Hannah)
 * @version (10.09.2019)
 */
public class ExerciseTwo
{
    private String a = "";
    private int b = 10;
    private int c = 5;
    private int d = 50;
    private int e = 3;
    private int f = 8;
    private double g = 10.0;
    private double h = 20.0;
    private double i = 30.0;
    private int array[]  = {1,2,3,4};
     public void myMethod()
    {
         String a = "Hannah";
         a = a.concat("Hello Hannah.");
         System.out.println(a);
    }
    public int getSum()
    {
        return b + c;
    }
    public int getQuotient()
    {
        return d / e;
    }
     public int getTotal(int A,int B,int C,int D)
    {
       return -A+B*A+(C+D)%D-C+-A*A/D+A+C/A*2-D%A;
     }
     public void myLoop()
    {
       for (int i = 1; i < 10; i++)
       {
           System.out.println(i * f);
        }
    }
    public double findAverage()
    {
       return (g + h + i) / 3;   
    }
    public void swapVariables(int par1, int par2)
    {
        int temp;
        temp = par2;
        par2 = par1;
        par1 = temp;
    }
    public void printElements()
    {
        System.out.println(array);
    } 
    
}
