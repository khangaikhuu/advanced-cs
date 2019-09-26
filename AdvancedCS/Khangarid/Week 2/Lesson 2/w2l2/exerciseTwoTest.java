

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class exerciseTwoTest
{
    @Test
    public void testA()
    {
        exerciseTwo ex = new exerciseTwo();
        assertEquals(15, ex.exerciseTwo(10, 5));
    }
}
