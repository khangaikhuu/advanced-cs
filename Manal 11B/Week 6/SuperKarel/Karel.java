package SuperKarel;

import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class Karel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Karel extends superKarel
{
    private String myName = "Karel";
    private int[] array = {1, 2, 3};
    
    private ArrayList<String>myArrayList = new ArrayList<String>();
    
    public void addElement(){
        myArrayList.add("test");
        myArrayList.add("next");
    }
    
    public ArrayList getArray(){
        return myArrayList;
    }

}
