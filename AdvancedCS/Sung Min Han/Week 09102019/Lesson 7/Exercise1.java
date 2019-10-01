/**
 * Write a description of class Exercise1 here.
 *
 * @author (Sung Min)
 * @version (9112019)
 */
public class Exercise1
{
    public void checkNum(int a)
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
    public void checkGreat(int a, int b, int c)
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
    public void checkDay(int a)
    {
        if (a == 1)
        {
            System.out.println("Monday");
        }
        else if (a == 2)
        {
            System.out.println("Tuesday");
        }
        else if (a == 3)
        {
            System.out.println("Wednesday");
        }
        else if (a == 4)
        {
            System.out.println("Thursday");
        }
        else if (a == 5)
        {
            System.out.println("Friday");
        }
        else if (a == 6)
        {
            System.out.println("Saturday");
        }
        else if (a == 7)
        {
            System.out.println("Sunday");
        }
        else
        {
            System.out.println("Number out of range");
        }
    }
    public void printNatNum()
    {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(i);
        }
    }
}
