
import java.util.ArrayList;
import java.util.List;

public class createArrayList {
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
