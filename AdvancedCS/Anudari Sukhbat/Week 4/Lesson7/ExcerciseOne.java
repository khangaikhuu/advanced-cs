
/**
 * Write a description of class ExcerciseOne here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExcerciseOne
{

    
    public void checkValue(int a, int b, int c)
    {
        if (a >= b)
        {  
            if (a >= c) 
            {
                System.out.println("a is biggest");
            }
            else 
            {
                System.out.println( "c is biggest");
            }
        }
            else if ( b > c) 
            { 
                System.out.println( "b is biggest");
            }
        }
 
     
     public  void checkFloat(float s)
     {
         if ( s == 0)
         {
             System.out.println( "zero");
          if ( s > 0)
          {
              System.out.println("Positive");
        }
        else if ( s < 0)
        {
            System.out.println("Negative");
        }
    }
    if ( s > 1000000)
    {
        System.out.println("");
    }
}

 public void checkNum2 ( int num2)
 {
           if (num2 == 1)
     {
         System.out.println( "Monday");
        }
         else if(num2 == 2)
     { 
         System.out.println( "Tuesday");
        }
        else if(num2 == 3)
     {
         System.out.println( "Wednesday");
        }
     else if(num2 == 4)
     { 
         System.out.println( "Thursday");
    }
    else if(num2 == 5)
    {
        System.out.println( "Friday");
    }
    else if(num2 == 6)
    {  
        System.out.println( "Saturday"); 
    }
    else if(num2 == 7)
    {
        System.out.println( "Sunday");
    }
    else 
    { 
        System.out.println( "Nothing");
    }
}
 public void checkNatural()
 {
     for(int i = 1; i < 10; i ++)
     {
         System.out.println( "The first 10 natural numbers are");
         System.out.println(i);
        }
    }
    
     public void checkNum( int num)
    {
        if (num >= 0)
        {
            System.out.println(num+ "it is a positive number");
        }
        else
        {
            System.out.println(num+ "it is a negative number");
        }
    }
}
    
    
        
        


