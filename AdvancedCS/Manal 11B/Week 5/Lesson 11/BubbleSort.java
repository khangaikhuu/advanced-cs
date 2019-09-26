import java.util.Arrays;
/**
 * Write a description of class BubbleSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BubbleSort
{
    public static int[] sort(int[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = array.length - 1; j > i; j--){
                if (array[j] < array[j - 1]){
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j-1] = temp;
                }
            }
        }
        return array;
    }
}
