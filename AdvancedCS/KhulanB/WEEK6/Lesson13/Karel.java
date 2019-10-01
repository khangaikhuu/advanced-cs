import java.util.ArrayList;

/**
 * Write a description of class Karel here.
 *
 * @author (Khulan)
 * @version (09.23.19)
 */
public class Karel extends SuperKarel
{
   private String myName = "Karel";
   private int[] array = {1,2,3};
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
