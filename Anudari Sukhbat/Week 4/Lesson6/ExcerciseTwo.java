
/**
 * Write a description of class ExcerciseTwo here.
 *
 * @author (Anudari Sukhbat)
 * @version (09/10/19)
 */
public class ExcerciseTwo
{
   private String a = " ";
   private int x = 10;
   private int y = 5;
   private int s = 50;
   private int d = 3;
   private int o = 8; 
   
   
   public double getAverage(double A, double B, double C)
   {
       return A + B + C / 3;
    }
    
    public void swapVariables(int par1, int par2)
    {
        int temp;
        temp = par2;
        par2 = par1;
        par1= temp;
    }

   
   public void calculateInput()
   {
       for ( int i = 1; i < 10; i ++)
       {
           System.out.println( i*o);
        }
    }
   
   public int getFormula(int A, int B, int C, int D)
   {
       return -A + B * A + (C+D) % D - C + -A*A / D + A + C / A * 2 - D % A;
    }
   
   public double getDivision()
   {
       return s/d;
    }
    
   
   public int getSum()
   {
       return x + y;
    }
    
 
   public static void main(String s)
   {
       String a = "Hello";
       a = a.concat (s);
       System.out.println(a);
       
    }
}
