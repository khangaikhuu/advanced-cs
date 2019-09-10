
/**
 * Write a description of class ExerciseOne here.
 *
 * @author (Amina)
 * @version (10.09.2019)
 */
public class ExerciseOne
{
    private String a = "";
    private int b = 0;
    private double [] c = {1.5,1.9,3.5};
    private int i = 0;
    public void conditionals()
    {
        for (i = 0; i <c.length; i++)
        {
            System.out.println(c[i]);
        }
    }
    public void changeA()
    {
        if ( b < 0)
     
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
