

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class FlowChartTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FlowChartTest
{
    @Test
    public void test(){
        FlowChart f = new FlowChart();
        assertEquals(30, f.checkValue());
    }
}
