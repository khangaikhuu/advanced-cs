
/**
 * Write a description of class ExerciseONe here.
 *
 * @author (Erkhem)
 * @version (1.0)
 */
public class ExerciseOne
{
    public String trueOrFalse(int a)
    {
        if(a>=0) return "Positive";
        return "Negative";
    }
    
    public int greatestThreeNum(int a, int b, int c)
    {
        int chosen;
        if(a>=b) chosen = a;
        else chosen =b;
        
        if(chosen<c) chosen = c;
        return chosen;
    }
    
    public String floatNumber(double a)
    {
        boolean positive=false;
        boolean zero = false;
        boolean small = false;
        boolean large = false;
        if(a>0) positive = true;
        else if( a==0) zero =true;
        
        if(a<1 && a>-1) small = true;
        if(a>1000000 || a<-1000000) large = true;
        
        if(positive == true)
        {
            if(small==true) return "Positive small";
            if(large==true) return "Positive large";
            else 
            {
                return "Positive";
            }
        }
        if(zero==true) return "Zero and small";
        if(small==true) return "Negative and small";
        if(large==true) return "Negative and large";
        return "negative";
    }
    
    public String weekday(int a)
    {
        if(a<1 || a>7) return "Invalid input";
        if(a==1) return "Monday";
        if(a==2) return "Tuesday";
        if(a==3) return "Wednesday";
        if(a==4) return "Thursday";
        if(a==5) return "Friday";
        if(a==6) return "Saturday";
        else return "Sunday";
    }
    
    public void print10Natural()
    {
        for(int i = 1; i<11 ; i++)
        {
            System.out.println(i+ "" +" " + i);
        }
    }
    
    public void sumAvg(int a, int b, int c, int d, int e)
    {
        System.out.println("Sum of numbers is" + (a+b+c+d+e));
        System.out.println("Avg is"+((a+b+c+d+e)/5));
    }
    
    public void printRightTriangle(int a)
    {
        for(int i = 1; i<=a; i++)
        {
            for(int k =1; k<=i; k++)
            {
                System.out.print(i);
            }
           System.out.println("");
        }
    }
    
    public void printCube(int a)
    {
        System.out.println("Number is : " +  a + " and cube of " + a + " is: " + (a*a));
    }
    
    public void printMultTable(int a)
    {
        for(int i =0; i<= a; i++)
        {
            System.out.println(a+"X"+i+"="+(i*a));
        }
    }
}
