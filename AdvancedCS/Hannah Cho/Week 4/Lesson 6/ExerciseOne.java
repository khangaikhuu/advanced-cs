
/**
 * Write a description of class ExerciseOne here.
 *
 * @author (Hannah)
 * @version (10.09.2019)
 */
public class ExerciseOne
{
    private String a = "";
    private int b = 0;
    private double[] c = {4.2,5.6,7.8};
    private int i = 0;
    
    public void changeA()
    {
     if (b == 0)
     {
       a = ("Hello World");   
     }
     else {
        a = ("World Hello");
     }
    }
    public String getA()
    {
        return a;
    }
       public void conditionals()
    {
       for (i = 0; i < c.length; i++)
       {
           System.out.println(c[i]);
        }
    }
}
