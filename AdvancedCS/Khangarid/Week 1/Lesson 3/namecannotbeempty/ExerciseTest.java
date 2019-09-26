

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ExerciseTest
{
    @Test
    public void tester()
    {
        Exercise ex = new Exercise();
        assertEquals(55, ex.calculateMyArray());
    }
}
