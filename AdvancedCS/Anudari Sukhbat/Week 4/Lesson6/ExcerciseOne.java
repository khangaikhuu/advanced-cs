
/**
 * Write a description of class ExcerciseOne here.
 *
 * @author (Anudari)
 * @version (09.10.19)
 */
public class ExcerciseOne
{
  private String a = " ";
  private int b = 0; 
  private double[] x = {1.1, 1.2, 1.3};
  private int i = 0;
  
  public void conditionals()
  {
      for ( i = 0; i < x.length; i++)
      {
          System.out.println(x[i]);
    }
}
  
  public void changeA()
  {
      if ( b == 0 )
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
