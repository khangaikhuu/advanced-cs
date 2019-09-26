
/**
 * Write a description of class ExerciseOne here.
 *
 * @author (Hannah)
 * @version (18.09.2019)
 */
public class ExerciseOne
{
   public static int[] bubbleSort(int[]array)
    {
       for (int i = 0; i < array.length; i++)
       {
         for (int j = array.length - 1; i > i ; j--)
         {
            if (array[j] <array [j - 1])
            {
                swap(array, j, j-1);
            }
        }
    }
    return array;
      }
   public static int[] swap(int[] array, int from, int to)
   {
    int temp = array[from];
    array[from] = array[to];
    array[to] = temp;
    return array;
        }
}
