import java.util.Arrays;
/**
 * Write a description of class Sort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sort
{
    public int[] sort(int[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = i; j > 0; j--){
                if (array[j - 1] > array[j]){
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    public int[] sortReverse(int[] array2){
        int[] array1 = sort(array2);
        for (int i = 0; i < array1.length / 2; i++){
            int temp = array1[i];
            array1[i] = array1[array1.length - 1 - i];
            array1[array1.length - 1 - i] = temp;
        }
        return array1;
    }
}
