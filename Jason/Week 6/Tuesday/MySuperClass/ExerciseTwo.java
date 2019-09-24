import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class ExerciseTwo here.
 *
 * @author (Jason, Tsengel, Sung Min)
 * @version (23.09.2019)
 */
public class ExerciseTwo
{
   private ArrayList<String> myArrayList = new ArrayList<String>();
   public void addElements()
   {
       myArrayList.add("Lion");
       myArrayList.add("Tiger");
       myArrayList.add("Cat");
       myArrayList.add("Dog");
       myArrayList.set(2, "Elephat");
       myArrayList.set(3, "Cat");
       myArrayList.add("dog");
       System.out.println(myArrayList);
   }
   public ArrayList getMyArrayList()
   {
       return myArrayList;
   }
   }
