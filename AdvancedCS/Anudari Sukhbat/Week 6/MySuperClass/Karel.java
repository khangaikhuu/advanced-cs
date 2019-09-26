import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class Karel here.
 *
 * @author (Anudari)
 * @version (23.09.19)
 */
public class Karel extends SuperKarel
{
    private String myName = "Karel";
    private int[] array = {1,2,3,5,6};
    
    private ArrayList<String> myArrayList = new ArrayList<String>();
    
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
