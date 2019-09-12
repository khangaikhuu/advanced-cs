
/**
 * Write a description of class javaProblems here.
 *
 * @author (Bilguundalai)
 * @version (11/9/2019)
 */
public class javaProblems
{
    public void checkNum(int num)
    {
        if (num >= 0)
        {
            System.out.println("Number is positive");
        }
        else
        {
            System.out.println("Number is negative");
        }
    }
    
    public void maxValue(int a, int b, int c)
    {
        if ( a >= b)
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
        else 
        {
            if (b > c)
        {
         System.out.println("b is the biggest");
        }
        else
        {
            System.out.println("c is the biggest");
        }
        }
    }
    public void floating(float b)
    {
        if (b == 0)
        {
            System.out.println("zero");
        }
        else if (b > 0)
        {
            System.out.println("positive");
        }
        else
        {
            System.out.println("negative");
        }
        if (Math.abs(b) < 0)
        {
            System.out.println("small");
        }
        if (Math.abs(b) > 1000000)
        {
            System.out.println("large");
        }
    }
    
    public void weekday(int b)
    
    {
        if (b > 0 && b <=7)
        {
            String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday","Friday", "Saturday", "Sunday"};
            System.out.println(weekDays[b - 1]);
        }
    }
    public void naturalNumbers()
    {
        for (int i = 1; i <=10; i++)
        System.out.println(i);
    }
    
}
    
    
        


