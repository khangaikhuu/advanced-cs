
/**
 * Write a description of class ExerciseOne here.
 *
 * @author (Khulan)
 * @version (09.11.19)
 */
public class ExerciseOne
{
   public void checkNumber(int num)
   {
       if(num > 0)
       {
           System.out.println("num is a positive number");
        }
        else 
        {
            System.out.println("num is a negative number");
        }
    }
   public void bigNumber(int num1, int num2, int num3)
   {
       if(num1>=num2)
       {
            if(num1>=num3)
            {
                System.out.println("Num1 is bigger");
            }
            else
            {
                System.out.println("Num3 is bigger");
            }
            
        }
        else
        {
             if(num2>=num3)
            {
                System.out.println("Num2 is bigger");
            }
            else
            {
                System.out.println("Num3 is bigger");
            }
        }
    }
    public void weekDay(int day)
    {
        if(day == 1)
        {
            System.out.println("Monday");
        }
        else if (day == 2)
        {
            System.out.println("Tueday");
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
            System.out.println("No weekday");
        }
    }
    public void getNumbers()
    {
       for (int i=1;i<=10;i++)
       {
           System.out.println (i);
       }
    }
}

