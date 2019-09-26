
/**
 * Write a description of class Exercise here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exercise
{
    private int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
    public int sumOfArray(){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }
}
