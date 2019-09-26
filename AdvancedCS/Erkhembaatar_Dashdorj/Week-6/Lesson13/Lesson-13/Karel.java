import java.util.ArrayList;
/**
 * Write a description of class Karel here.
 *
 * @author (Erkhem)
 * @version (9/23/19)
 */
public class Karel extends SuperKarel
{
   private int[] array1 = {5,4,3,2,1};
   private int[] array2 = {1,2,3,4,5};
   private int[] array3 = {2,3,1,4,5};
   private ArrayList<Integer> arrayList = new ArrayList<Integer>();
   public void addElements()
   {
       arrayList.add(5);
       arrayList.add(10);
    }
    
    public ArrayList getArrayList()
    {
        return arrayList;
    }
   
}
