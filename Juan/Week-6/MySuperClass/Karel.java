import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class Karel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Karel extends SuperKarel
{
    private String myName= "Karel";
    private int[] array = {1,2,3};
    private ArrayList<String> ab= new ArrayList();
    
    public Karel()
    {
    }
    
    public Karel(String name)
    {
        myName = name;
    }
    
    public Karel(String name, int[] a)
    {
        myName = name;
        array = a;
    }
    
    public void addElements()
    {
        ab.add("num");
        ab.add("not_num");
    }
    
    public ArrayList getMyArrayList()
    {
        return ab;
    }
}
