

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class exercise2Test
{
    @Test
    public void tester()
    {
       exercise2 ex = new exercise2();
       assertEquals(30, ex.ifMethod());
    }
}
