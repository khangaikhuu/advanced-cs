
/**
 * Write a description of class JavaProblems here.
 *
 * @author (Hayeon Lee)
 * @version (11/09/2019)
 */
public class JavaProblems
{
   
   public void getPositive(int a)
   {
       if (a > 0){
       System.out.println("Number is positive");
    }
    else {
        System.out.println("Number is negative");
    }
    
    }
   public void maxNumber(int A, int B, int C)
   {
       if (A >= B) {
           if (A >= C) {
               System.out.println("A is biggest");
            }
            else {
                System.out.println("C is biggest");
            }
        }
        else {
            if (B > C) {
                System.out.println("C is biggest");
            }
            
            else {
                System.out.println("B is biggest");
            }
        }
    }
   public void getFloat(float E)
   {
       if (Math.abs(E) == 0) {
           System.out.println("Number is zero");
           System.out.println("small");
        }
        else if (Math.abs(E) > 0) {
            System.out.println("Number is positive");
            if (E == 1000000) {
                System.out.println("large");
            }
        }
        else {
            System.out.println("Number is negative");
        }
    }
   public void getWeekdays(int a)
   {
      if ( a == 1) {
          System.out.println("Monday");
      }
      else if (a == 2) {
        System.out.println("Tuesday");
      }
      else if (a == 3) {
         System.out.println("Wednesday");
      }
      else if (a == 4) {
          System.out.println("Thursday");
        }
        else if (a == 5) {
            System.out.println("Friday");
        }
        else if (a == 6) {
            System.out.println("Saturday");
        }
        else if (a == 7) {
            System.out.println("Sunday");
        }
        else {
            System.out.println("The day do not exist");
        }
            
        
       
    }
   public void getNaturalNumbers()
   {
       for(int i = 1; i < 10; i++)
       {
           System.out.println("The first 10 natural numbers are");
           System.out.println(i);
        }
           
    }
}
