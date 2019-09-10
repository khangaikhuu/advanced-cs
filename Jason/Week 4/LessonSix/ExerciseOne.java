
/**
 * Write a description of class ExerciseOne here.
 *
 * @author (Jason)
 * @version (10.09.2019)
 */
public class ExerciseOne
{
    private String a = "";
    private int b = 0;
    private double[] c = {2.3, 5.4, 5.2};
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
            a = "Helllo World";
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
