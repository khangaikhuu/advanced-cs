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
   private String myName = "Karel";
   private int[] intArray = {1, 2, 3};
   private ArrayList<String> myArrayList = new ArrayList();
   
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
