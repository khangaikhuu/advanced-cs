package SuperKarel;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class KarelTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class KarelTest
{
    Karel karel = new Karel();
    Karel karelOne = new Karel("New Karel");
    int[] ar = {2, 4};
    Karel karelTwo = new Karel("New Karel", ar);
}
