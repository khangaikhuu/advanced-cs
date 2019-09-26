
/**
 * Write a description of class lesson6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class lesson6
{
    private int great;
    private int arrays[] = {6,7,4,8};
    public void positiver(int a)
    {
        if(a>=0)
        {
            System.out.println("number is postive");
        }
        else
        {
            System.out.println("number is negative");
        }
    }
    
    public void greatest (int a, int b, int c)
    {
        
            if(a>b)
            {
                great = a;
            }
            if(b>a)
            {
                great=b;
            }
            if(c>b)
            {
                great=c;
            }
        System.out.println(great);
    }
    
    public void numChecker(float a)
    {
        System.out.println(a);
        if(a==0.0)
        {
            System.out.println("Number is zero");
        }
        else if(a>0.0)
        {
            System.out.println("positive");
        }
        else
        {
            System.out.println("negative");
        }
        if(Math.abs(a)<1.0)
        {
            System.out.println("small");
        }
        else if(Math.abs(a)>1000000.0)
        {
            System.out.println("large");
        }
    }
    public void weekday(int a)
    {
        if(a==1)
        System.out.println("Monday");
        else if(a==2)
        System.out.println("Tuesday");
        else if(a==3)
        System.out.println("Wednesday");
        else if (a==4)
        System.out.println("Tuesday");
        else if(a==5)
        System.out.println("Friday");
        else if(a==6)
        System.out.println("Saturday");
        else if(a==7)
        System.out.println("Sunday");
        else
        System.out.println("num is not within 1-7");
    }
    
    public void natNums()
    {
        for(int i=1;i<11;i++)
        {
            System.out.println(i);
        }
    }
    
    public void sumAv(int a,int b,int c,int d, int e)
    {
        int z;
        System.out.println("Input 5 numbers:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println("The sum of 5 no is : ");
        System.out.println(a+b+c+d+e);
        System.out.println("The average is");
        z=a+b+c+d+e;
        System.out.println(z/5);
    }
    
    public void pattern(int a)
    {
        int temp = 0;
        for(int i = 1; i<= a;i++)
        {
            temp = i;
            for (int j = 1; j <= temp; j++)
            {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
    
    public void cuber(int a)
    {
        for(int i=1; i<=a;i++)
        {
            System.out.println("Number is: "+i+" and cube of "+i+" is "+Math.pow(i,3));
        }
    }
    
    public void table(int a)
    {
        System.out.println("Input multiplication table number: "+a);
        for(int i = 0; i<=a;i++)
        {
            System.out.println(a+" X " +i+" = "+a*i);
        }
    }
    
}
