
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CreateArrayListExampleTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CreateArrayListExampleTest
{
    @Test
    public void test(){
        CreateArrayListExample c = new CreateArrayListExample();
        ArrayList<String> expectedList = new ArrayList<String>();
        expectedList.add("Lion");
        expectedList.add("Tiger");
        expectedList.add("Cat");
        expectedList.add("Dog");
        assertEquals(expectedList, c.createArrayList());
        ArrayList<String> expectedList1 = new ArrayList<String>();
        expectedList1.add("Lion");
        expectedList1.add("Tiger");
        expectedList1.add("Elephant");
        expectedList1.add("Cat");
        expectedList1.add("Dog");
        assertEquals(expectedList1, c.addIndex());
    }
}
