
/**
 * Write a description of class TypeConversion here.
 *
 * @author (Bilguundalai)
 * @version (04.09.2019)
 */
public class TypeConversion
{
  private int a = 10;
  private double b;
  
  public int getA()
    {
      return a;
    }  
  public double getB()
    {
        return b;
    }
  public void convertA(int number)
    {
        b = (double) number;
    }
  public double convertSum(int x, int y)
    {
        return (double) (x + y);
    }
}
