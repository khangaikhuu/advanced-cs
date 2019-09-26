
/**
 * Here is my conditionals IF ELSE
 *
 * @author (Erkhem)
 * @version (1.0)
 */
public class Conditionals
{
    private int a = 10;
    private int b = 20;
    private int c =10;
    
    public boolean checkMax()
    {
        if(a > b) return true;
        else if(a>c) return true;
        else return false;
    }
    
    public String checkMax2Strings(String x , String y)
    {
        if(x.length()>y.length()) return x + " is bigger";
        else if(x.length()<y.length()) return y+" is bigger";
        else return "The numbers are equal";
    }
    public String checkMax2Numbers( int x , int y)
    {
        if(x >y) return x + " is bigger";
        else if(x <y) return y + " is bigger";
        else return "The numbers are equal";
    }
    
}
