import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class exerciseOneTest
{
    @Test
    public void testA()
    {
        exerciseOne ex = new exerciseOne();
        assertEquals("Hello Harry", ex.exerciseOne("Harry"));
    }
}
