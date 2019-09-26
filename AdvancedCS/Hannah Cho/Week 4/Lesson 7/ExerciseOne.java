
/**
 * Write a description of class ExerciseOne here.
 *
 * @author (Hannah)
 * @version (11.09.2019)
 */
public class ExerciseOne
{
     public void checkNum(int num)
   {
     if (num >= 0)
     {
         System.out.println(num+ "it is a postitive number");
        }
     
     else 
     {
          System.out.println(num+ "it is a negative number");
        }
    }
   private int a;
   private int b;
   private int c;
   public void myMethod()
   {
    if (a >= b)
     {
         if (a >= c)
         {
             System.out.println("a is the biggest");
          }
          else
          {
             System.out.println("c is the biggest");
            }
    }
    else if (b > c)
    {
           System.out.println("b is the biggest");
        }
   }
   private float num1;
    public void myFloat()
   {
    if (num1 == 0)
     {
           System.out.println("zero");
        }
        else if (num1 > 0)
    {
           System.out.println("Positive");
            }
         else
     {
           System.out.println("Negative");  
            }
    if (num1 > 1000000)
    {
         System.out.println("large");   
        }
        else if (num1 < 0)
    {
          System.out.println("Small");  
        }
    }
   private int day1;
   private int day2;
   private int day3;
   private int day4;
   private int day5;
   private int day6;
   private int day7;
   public void daysOfTheWeek()
   {
     if (day1 == 1)
     {
         System.out.println("Monday");
        }
     else if (day2 == 2)
     {
         System.out.println("Tuesday");
        }
     else if (day3 == 3)
     {
         System.out.println("Wednesday");
        }
     else if (day4 == 4)
     {
         System.out.println("Thursday");
        }
     else if (day5 == 5)
     {
         System.out.println("Friday");
        }
     else if (day6 == 6)
     {
         System.out.println("Saturday");
        }
     else if (day7 == 7)
     {
         System.out.println("Sunday");
        }
     else
     {
         System.out.println("Non-existent");
        }
    }
     public void naturalNumbers()
   {
     for (int i = 1; i <= 10; i++)
     {
         System.out.println("The first 10 natural numbers are");
         System.out.println(i);
        }
    }
}
