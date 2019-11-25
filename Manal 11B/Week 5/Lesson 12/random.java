
import java.util.Random;
/**
 * Write a description of class random here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class random
{
    public static void main()
    {
        Random rnd = new Random();
        int n1 = rnd.nextInt(15);
        System.out.println(n1);
    }
}
