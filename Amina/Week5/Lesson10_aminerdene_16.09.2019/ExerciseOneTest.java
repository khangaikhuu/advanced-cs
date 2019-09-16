

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExerciseOneTest.
 *
 * @author  (Amina)
 * @version (16.09.2019)
 */
public class ExerciseOneTest
{
    @Test
    public void ExerciseOneTest()
    {
        ExerciseOne ex1 = new ExerciseOne();
        int arr [] = {1,2,3,4,5};
        ex1.insertionsort(arr);
    }
}
