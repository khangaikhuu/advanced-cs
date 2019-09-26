
/**
 * Write a description of class ExerciseOne here.
 *
 * @author (Erkhem)
 * @version (9/10/19
 */
public class ExerciseOne
{
   private String a;
   private int b = 0;
   private double[] c = {5.0,2.0,5.0};
   private int i = 0;
   public void changeA()
   {
       if(b<0)
       {
           a = "Hello World";
        }
        else 
        {
            a = "World Hello";
        }
    }
    public String getA()
    {
        return a;
    }
    public double printC()
    {
        if(i <c.length)
        {
            System.out.println(c[i]);
            return c[i];
        }
        return -1;
    }  
}
