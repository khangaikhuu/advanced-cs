
/**
 * Write a description of class JavaProblems here.
 *
 * @author (Chingun)
 * @version (11.09.2019)
 */
public class JavaProblems
{
    public void checkNum (int a) 
    { 
       if (a >= 0) 
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
       if (a >= b)
       { 
           if( a >= c) 
           { 
              System.out.println("a is the biggest");
            } 
           else 
        { 
            System.out.println("b is the biggest");
        }
         if (b > c)
        { 
            System.out.println("c is the biggest");
        } 
        else 
        { 
            System.out.println("b is the biggest"); 
        } 
    }
} 
public void floating (int a) 
{ 
    if (a < 0) 
    { 
        System.out.println("negative"); 
    } 
    else if (a > 0) 
    { 
        System.out.println("positive"); 
    } 
    else 
    { 
        System.out.println("zero"); 
    } 
    if (Math.abs(a) < 0)
    { System.out.println("small"); 
     if (Math.abs(a) > 1000000)
     { 
         System.out.println("small");
        } 
} 
}          
public void weekday(int a) 
{  
    if (a > 0 && a <=7)
    { 
        String[] week = {"Monday", "Tuesday", "Wednesday","Thursday","Friday","Saturday","Sunday"};
    System.out.println(week[a - 1]); 
}
} 


public void naturalNumber() 
{ 
    for (int i = 1; i < 11; i++) 
    System.out.println(i);
} 
} 

    


