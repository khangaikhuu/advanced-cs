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
    private ArrayList<String> array = new ArrayList();
    
    public void addElements()
    {
        array.add("num");
        array.add("not_num");
    }
    
    public ArrayList getMyArrayList()
    {
        return array;
    }
}
