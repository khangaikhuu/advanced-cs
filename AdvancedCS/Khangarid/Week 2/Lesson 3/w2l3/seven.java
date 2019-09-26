
 public class seven
{
    public void exercise1 (int a)
    {
        if (a > 0) {
            System.out.println("The number is positive");
        }
        else {
            System.out.println("The number is negative");
        }
    }
    public void exercise2 (int x, int y, int z)
    {
        if (x > y) {
            if (x > z) {
                System.out.println(x+ " is the greatest number");
            }
            else {
                System.out.println(z+ " is the greatest number");
            }
        }
        else if (y > z) {
            System.out.println(y+ " is the greatest number");
        }
        else {
            System.out.println(z+ " is the greatest number");
        }
    }
    public void exercise3 (float b)
    {
        if (b == 0) {
            System.out.println("The number is zero");
        } else if (b > 0) {
            System.out.println("The number is positive");
        } else if (b < 0) {
            System.out.println("The number is negative");
        }
        if (Math.abs(b) < 1) {
            System.out.println("The number is small");
        } else if (Math.abs(b) > 1000000) {
            System.out.println("The number is large");
        }
    }
    public void exercise4 (int c)
    {
        if (c == 1) {
            System.out.println("Monday");
        } else if (c == 2) {
            System.out.println("Tuesday");
        } else if (c == 3) {
            System.out.println("Wednesday");
        } else if (c == 4) {
            System.out.println("Thursday");
        } else if (c == 5) {
            System.out.println("Friday");
        } else if (c == 6) {
            System.out.println("Saturday");
        } else if (c == 7) {
            System.out.println("Sunday");
        } else
        System.out.println("Invalid input");
    }
    public void exercise5 ()
    {
        for (int i = 1; i<=10; i++)
        {
        System.out.println(i);
    }
    }
    public void exercise6 (int l, int m, int n, int o, int p)
    {
        int sum = l + m + n + o + p;
        System.out.println("The sum is " +sum);
        int mean = sum / 5;
        System.out.println("The average is " +mean);
    }
    public void exercise7 (int s)
    {
        int temp = 0;
        for (int i = 1; i <= s; i++)
        {
            temp = i;
            for (int j = 1; j <=temp; j++)
            {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
    
}
