
/**
 * Write a description of class conditionals here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class conditionals
{
    // instance variables - replace the example below with your own
    private int a = 10;
    private int b = 20;
    private int c = 10;
    
    public String checkMaxTwoNumber(int num1, int num2)
    {
        if(num1>num2){
            return "Number one is bigger";
        }else if(num2>num1){
            return "Number two is bigger";
        }else{
            return "The numbers are equal to each other";
        }
    }
    
    public String numChecker(int num1, int num2)
    {
        if(num1 == 10  && num2 == 20)
        {
            return"num1 is 10 and num2 is 20";
        }
        else if(num1 == 10 && num2 == 5)
        {
            return"num1 is 10 and num2 is 5";
        }
        else if(num1 == 10 && num2==10)
        {
            return "num1 is 10 and num2 is 10";
        }
        else return "num1 is " + num1 + " num2 is "+ num2 + "";
           
    }
    
    public boolean checkMaximum()
    {
        if(a>b)
        {
            return true;
        }
        else if(a>c)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
