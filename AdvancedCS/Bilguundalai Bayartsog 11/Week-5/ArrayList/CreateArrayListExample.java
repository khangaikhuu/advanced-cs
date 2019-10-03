import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class CreateArrayListExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreateArrayListExample
{
    public ArrayList createArrayList(){
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");
        return animals;
    }
    public ArrayList addIndex(){
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");
        animals.add(2, "Elephant");
        return animals;
    }
}
