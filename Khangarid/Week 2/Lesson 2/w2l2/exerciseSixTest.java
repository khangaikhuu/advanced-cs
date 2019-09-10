

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class exerciseSixTest
{
    @Test
    public void testA()
    {
        exerciseSix ex = new exerciseSix();
        assertEquals(20.0, 1, ex.exerciseSix(10.0, 20.0, 30.0));
    }
}
