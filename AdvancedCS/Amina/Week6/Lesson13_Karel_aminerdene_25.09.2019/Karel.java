import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class Karel here.
 *
 * @author (amina)
 * @version (09.23.19)
 */
public class Karel extends SuperKarel
{
   private String myName = "Karel";
   private int[] array = {1,2,3};
   private ArrayList<String> myArrayList = new ArrayList();
   public Karel()
   {
    }
   public Karel(String name, int a[])
    {
        myName = name;
        array = a;
    }
   public Karel(String name)
    {
        myName = name;
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
