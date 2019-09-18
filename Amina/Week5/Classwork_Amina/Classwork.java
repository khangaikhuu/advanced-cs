
/**
 * Write a description of class Classwork here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Classwork
{
     public int[] bubbleSort(int[] array, int n)
    {
        for( int i = 0; i < array.length;i++)
        {
            for(int j = n -1; j > i; j--)
            {
                if( array[j] < array[j-1])
                { 
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        return array;
    }
}
