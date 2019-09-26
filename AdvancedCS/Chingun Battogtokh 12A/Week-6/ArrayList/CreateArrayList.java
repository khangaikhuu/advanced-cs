import java.util.ArrayList; 
import java.util.List; 

/**
 * Write a description of class CreateArrayList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreateArrayList
{ 
    public ArrayList createArrayList(String Elephant) 
{
    ArrayList<String> animals = new ArrayList(); 
    
    animals.add("Lion"); 
    animals.add("Tiger"); 
    animals.add("Cat"); 
    animals.add("Dog"); 
    
    System.out.println(animals); 
    animals.add(2,Elephant); 
    return animals;
}
    
}
