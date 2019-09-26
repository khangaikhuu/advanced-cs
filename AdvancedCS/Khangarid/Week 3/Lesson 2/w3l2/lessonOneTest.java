import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

public class lessonOneTest
{
    @Test
    public void testMyArea()
    {
        lessonOne one = new lessonOne();
        assertEquals(50.24, 1, lessonOne.getArea(4));
        assertEquals(true, one.compareArrays());
    }
}
