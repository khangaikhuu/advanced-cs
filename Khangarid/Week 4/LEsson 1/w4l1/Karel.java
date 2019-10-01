import java.util.ArrayList;
public class Karel extends SuperKarel
{
    private String myName = "Karel";
    private int[] array = {1, 2, 3};
    private ArrayList<String> myArrayList = new ArrayList<String>();
    
    
    public void addElement()
    {
        myArrayList.add("Test");
        myArrayList.add("Next");
    }
    
    public ArrayList getMyArrayList()
    {
        return myArrayList;
    }
}
