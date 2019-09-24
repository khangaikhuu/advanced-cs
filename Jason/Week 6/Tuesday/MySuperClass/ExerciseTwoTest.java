 


import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExerciseTwoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ExerciseTwoTest
{
    @Test
    public void testMyExerciseTwo()
    {
       ExerciseTwo e2 = new ExerciseTwo();
       e2.addElements();
       ArrayList<String> myArrayList = new ArrayList<String>();
       myArrayList.add("Lion");
       myArrayList.add("Tiger");
       myArrayList.add("Cat");
       myArrayList.add("Dog");
       
    }
}

