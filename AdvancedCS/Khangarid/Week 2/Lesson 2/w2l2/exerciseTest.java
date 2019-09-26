import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class exerciseTest
{
    @Test
    public void testA()
    {
        exercise one = new exercise ();
        one.changeA();
        assertEquals("World Hello", one.getA());
        one.conditional();
    }
}
