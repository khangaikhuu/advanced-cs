
/**
 * Write a description of class ClassWork here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClassWork
{
    public void posOrNeg(int x)
    {
        if(x < 0)
        {
            System.out.println("Number is negative");
        }
        if(x > 0)
        {
            System.out.println("Number is positive");
        }
        else
        {
            System.out.println("Zero");
        }
    }
     public static int getMaxValue(int[] numbers)
    {
        int maxValue = numbers[0];
        for(int i=1;i < numbers.length;i++){
            if(numbers[i] > maxValue){
	     maxValue = numbers[i];
	    }
        }
        return maxValue;
    }
    public void posNeg(int x)
    {
         if(x > 0)
        {
           System.out.println("Positive");
        }
        else if(x < 0)
        {
            System.out.println("Negative");
        }
        else
        {
            System.out.println("Zero");
        }
         if(Math.abs(x) < 0)
        {
            System.out.println("Small");
        }
        else if(Math.abs(x) > 1000000)
        {
            System.out.println("Large");
        }
    }
    public void weekday(int x)
    {
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(week[x]);
    }
    public void natural()
    {
        for (int i = 1; i < 11; i++)
        {
            System.out.println(i);
        } 
    }  
    public void average(int a, int b, int c, int d, int e)
    {
        int sum = a + b + c + d + e;
        System.out.println("The sum is" + sum);
        System.out.println("The average is" + (sum / 5));
    }
    public void pattern(int n)
    {
        for (int i = 1; 1<= n; i ++)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.println(i);
            }
            System.out.println("");
        }
    }
    public void cube(int x)
    {
        for (int i = 1; i <= x; i++)
        {
            System.out.println(Math.pow(i, 3));
        }
    }
    public void tableM(int x, int y)
    {
        for (int i = 0; i <= y; i++)
        {
            System.out.println(y * i);
        }
    }
}


