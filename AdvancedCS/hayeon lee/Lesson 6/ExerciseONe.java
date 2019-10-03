
/**
 * Write a description of class ExerciseONe here.
 *
 * @author (hayeon lee)
 * @version (10/09/2019)
 */
public class ExerciseONe
{
    private String a = "";
    private int b = 0;
    private int i = 0;
    private double[] c = {1.2,2.3};
    
    public void changeA()
    {
        if (b == 0)
        {
            a = ("Hello World");
        }
        else
        {
            a =("World Hello");
        }
    }
    public void conditionals()
    {
        for (i = 0; i < c.length; i++)
        {
            System.out.println(c[i]);
    }    
}       
   public String getA()
   {
        return a;
   }

}
