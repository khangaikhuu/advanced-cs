
/**
 * Write a description of class Conditionals here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Conditionals
{
     private int a = 10;
    private int b = 20;
    private int c = 10;
  
    public boolean checkMaximum()
    {
      if (a > b)
      {
        return true;
      }
      else if( a > c)
      {
        return true;
      }
      else
      {
        return false;
      }
    }
}
