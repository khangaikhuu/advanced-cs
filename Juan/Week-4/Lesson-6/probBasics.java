
/**
 * Write a description of class probBasics here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class probBasics
{
    private int max;
    public String concat(String name)
    {
        String hello = "Hello";
        name=hello.concat(name);
        System.out.println(name);
        return name;
    }
    
    public int adder(int a, int b)
    {
        return a+b;
    }
    public int divider(int c, int d)
    {
        return c/d;
    }
    public int formula(int A, int B,int C, int D)
    {
        return -A + B * A + (C+D) % D - C + -A*A / D + A + C / A * 2 - D % A;
        
    }
    
    public void table(int z)
    {
        for(int i = 1; i<10;i++)
        {
            System.out.println(z*i);
        }
    }
    public double average(double a, double b, double c)
    {
        double d=a+b+c;
        return d/3;
    }
    public void swap(int a,int b)
    {
        int c = b;
        b = a;
        a=c;
        System.out.println(a);
         System.out.println(b);
    }
    
    public void face()
    {
        System.out.println("+\"\"\"\"\"+");
        System.out.println("[| o o |]\n|  ^  |\n| '-' |\n+-----+");
    }
    public void intArray(int[] array)
    {
      for(int i =0; i<array.length;i++)
      {
          System.out.println(array[i]);
        }
    }
    public int maximum(int[] array)
    {
       
      for(int i =0; i<array.length;i++)
      {
          if(array[i]>array[++i])
          {
              max=array[i];
          }
          else
          {
              max=array[++i];
          }
      }
      return max;
    }
}
