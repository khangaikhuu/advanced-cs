
/**
 * Write a description of class ExerciseOne here.
 *
 * @author (Bilguundalai)
 * @version (10/09/2019)
 */
public class ExerciseOne
{
   private String a = "";
   private int b = 0;
   
   public void changeA()
   {
       if (b == 0)
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
    
   private double[] c = {3.4, 5.1, 7.5};
   private int i = 0;
   
   public void conditionals()
   {
       for (i = 0; i < c.length; i++)
       {
           System.out.println(c[i]);
        }
    }
       
}
