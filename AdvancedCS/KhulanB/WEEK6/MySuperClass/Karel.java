import java.util.ArrayList;
/**
 * Write a description of class Karel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Karel
{
   private String myName = "SuperKarel";
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
