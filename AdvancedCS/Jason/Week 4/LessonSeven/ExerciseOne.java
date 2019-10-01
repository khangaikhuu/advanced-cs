
/**
 * Write a description of class ExerciseOne here.
 *
 * @author (Jason)
 * @version (11.9.2019)
 */
public class ExerciseOne
{
    public void checkNum(int a)
    {
        if (a > 0)
        {
            System.out.println("its positive");
        }
        else
        {
            System.out.println("its negative");
        }
    }
    public void largeNum(int a, int b, int c)
    {
        if (a >= b)
      {
          if (a >= c)
          {
              System.out.println("A is the biggest number");
          }
          else
          {
              System.out.println("C is the biggest number");
          }
      }
      else
      {
          if (b >= c)
      {
          System.out.println("B is the biggest number");
      }
      else
      {
          System.out.println("C is the biggest number");
      }
      }
    }
    public void floatPnt(int p)
    {
        
    }
    
    public void weekDay(int numb)
    {
        if (numb == 1)
        {
            System.out.println("monday");
        }
        else if (numb == 2)
        {
            System.out.println("tuesday");
        }
        else if (numb == 3)
        {
            System.out.println("wednesday");
        }
        else if (numb == 4)
        {
            System.out.println("thursday");
        }
        else if (numb == 5)
        {
            System.out.println("friday");
        }
        else if (numb == 6)
        {
            System.out.println("saturday");
        }
        else if (numb == 7)
        {
            System.out.println("sunday");
        }
        else
        {
            System.out.println("Number isnt a week day");
        }
    }
    public void printNum()
    {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(i);
        }
    }
}