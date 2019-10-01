import java.util.ArrayList;
import java.util.List;
/**
 * Karel my child class.
 *
 * @author (Bilguundalai)
 * @version (23.09.2019)
 */
public class Karel extends SuperKarel
{
    private String myName = "Karel";
    private int[] array = {1, 2, 3};
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
