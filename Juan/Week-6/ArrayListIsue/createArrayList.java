import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class createArrayList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class createArrayList
{
    public ArrayList createArrayList(String Elephant) 
    {
        ArrayList<String> animals = new ArrayList();
// Creating an ArrayList of String with name animals
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");
        
        System.out.println(animals);
// Adding new elements to the ArrayList
        animals.add(2,Elephant);
// Adding an element at the particular index  in an ArrayList
        return animals;
    }
}
