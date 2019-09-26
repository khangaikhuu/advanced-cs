

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class exerciseThreeTest
{
    @Test
    public void testA()
    {
        exerciseThree ex = new exerciseThree();
        assertEquals(16, ex.exerciseThree(50, 3));
    }
}
