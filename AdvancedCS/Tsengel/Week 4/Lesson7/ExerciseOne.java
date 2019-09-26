/**
 * Write a description of class ExerciseOne here.
 *
 * @author (Tsengel)
 * @version (11.09.2019)
 */
public class ExerciseOne
{
    public void checkNumber(int a)
    {
        if (a > 0)
        {
          System.out.println("Number is positive");
        }
        else
        {
          System.out.println("Number is negative");
        }
    }
    
    public void largestNum(int num1, int num2, int num3)
    {
        if (num1 >= num2)
        {
            if (num1 >= num3)
            {
                System.out.println("num1 is bigger");
            }
            else
            {
                System.out.println("num3 is bigger");
            }
        }
        else
        {
            if (num2 >= num3)
        {
              System.out.println("num2 is bigger");
        }
        else
        {
              System.out.println("num3 is bigger");
        }
        }
    }
    
    public void getWeek(int day)
    {
        if (day == 1)
        {
            System.out.println("Monday");          
        }
        else if(day == 2)
        {
            System.out.println("Tuesday");       
        }
        else if (day == 3)
        {
            System.out.println("Wednesday");          
        }
        else if(day == 4)
        {
            System.out.println("Thursday");       
        }
        else if(day == 5)
        {
            System.out.println("Friday");       
        }
        else if (day == 6)
        {
            System.out.println("Saturday");          
        }
        else if(day == 7)
        {
            System.out.println("Sunday");       
        }
        else
        {
            System.out.println("Day doesn't exist");       
        }
    }
    
    public void getNumbers()
    {
        for (int i = 0; i <= 10; i++)
        {
            System.out.println(i);       
        }
    }    
}
