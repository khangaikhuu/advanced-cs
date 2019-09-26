
/**
 * Write a description of class ExerciseOne here.
 *
 * @author (Amina)
 * @version (11.09.2019)
 */
public class ExerciseOne
{
    public void checkNumber(int number)
    {
      
      if (number > 0)
      {
          System.out.println(number+" is a positive number");
          
      }
      else if(number<0)
      {
          System.out.println(number+" is a negative number");
      }
      else
      {
            System.out.println(number+" is neither positive nor negative");
      }
    }
    public void greatestNumber( int a, int b, int c)
    {
        if (a >= b)
        {
            if (a >= c)
            {
                System.out.println("a is bigger ");
            }
           else 
            {
                System.out.println("c is biiger");
            }
         
        }
        else 
        {
            if (b >= c)
            {
                System.out.println("b is bigger ");
            }
           else 
            {
                System.out.println("c is biger");
            } 
        }
    }
    public void weekDay(int day)
    {
         if ( day == 1 )
         {
             System.out.println("Monday");
         }
         else if (day == 2)
         {
             System.out.println("Tuesday");
         }
         else if (day == 3)
         {
             System.out.println("Wednesday");
         }
         else if (day == 4)
         {
             System.out.println("Thursday");
         }
         else if (day == 5)
         {
             System.out.println("Friday");
         }
         else if (day == 6)
         {
             System.out.println("Saturday");
         }
         else if (day == 7)
         {
             System.out.println("Sunday");
         }
         else 
         {
             System.out.println("No day");
         }
    }
    public void getNumbers(int num)
    {
        for ( int i = 1; i <= 10; i++)
        {
            System.out.println(i);
        }
    }
}
