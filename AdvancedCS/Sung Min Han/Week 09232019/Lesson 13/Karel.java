import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class Karel here.
 *
 * @author (Sung Min)
 * @version (9232019)
 */
public class Karel extends SuperKarel
{
    private int[] myArray = {1, 2, 3};
    private String myName = "Karel";
    private ArrayList<String> myArrayList = new ArrayList<String>();
    
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
        myArray = a;
    }
    
    public void addElements()
    {
        myArrayList.add("Test");
        myArrayList.add("Next");
    }
    
    public ArrayList getMyArrayList()
    {
        return myArrayList;
    }
    
}
