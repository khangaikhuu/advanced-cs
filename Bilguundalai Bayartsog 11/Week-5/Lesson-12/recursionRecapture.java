
/**
 * Write a description of class mergeSortAlgorithm here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class recursionRecapture
{
    public int product(int n)
    {
 
        if(n > 1)
        {
            return product(n-1) * n;
        }
        return n;
    }
}
