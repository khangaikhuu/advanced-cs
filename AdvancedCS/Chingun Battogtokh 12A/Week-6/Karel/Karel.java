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
       intArray = a;
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
