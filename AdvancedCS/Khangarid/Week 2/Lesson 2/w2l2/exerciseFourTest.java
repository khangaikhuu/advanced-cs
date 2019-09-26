

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class exerciseFourTest
{
    @Test
    public void testA()
    {
        exerciseFour ex = new exerciseFour();
        assertEquals(8, ex.exerciseFour(1, 2, 3, 4));
    }
}
