
/**
 * Write a description of class ExerciseOne here.
 *
 * @author (Anand)
 * @version (09.10.19)
 */
public class ExerciseOne
{
    private String a = "" ;
    private int b = 0;
    private double[] c = {1.1, 1.2, 1.3, 1.4, 1.5};
    private int i = 0;
    
    public void conditionals()
    {
        for (i = 0; i < c.length; i++)
        {
            System.out.println(c[i]);
        }
    }
    
    public void changeA()
    {
        if (b < 0)
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
    
   
}
