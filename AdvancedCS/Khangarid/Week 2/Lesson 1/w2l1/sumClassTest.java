import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class sumClassTest
{
    @Test
    public void testSumClass()
    {
        sumClass ex1 = new sumClass();
        assertEquals(0, ex1.getSum());
        ex1.addGlobalSum(1);
        assertEquals(1, ex1.getSum());
        ex1.addGlobalSum(5);
        assertEquals(6, ex1.getSum());
        assertEquals(10, ex1.addLocalSum(5));
    }
}
