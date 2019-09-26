
/**
 * Write a description of class JavaProblems here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JavaProblems
{
    public int average(int[] array){
        int sum = 0;
        int n = array.length;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum / n;
    }
    public boolean value(int[] array, int x){
        boolean b = false;
        for (int i = 0; i < array.length; i++){
            if (x == array[i]){
                b = true;
                break;
            }
        }
        return b;
    }
    public int index(int[] array, int x){
        int index = 0;
        for (int i = 0; i < array.length; i++){
            if (x == array[i]){
                index = i;
                break;
            }
        }
        return index;
    }
    public void maxMin(int[] array){
        int max = 0;
        int minimum = 0;
        int n = array.length;
        int n1 = array.length - 1;
        for (int i = 0; i < n - 1; i++){
            int min = i;
            for (int j = i + 1; j < n; j++){
                if (array[j] < array[min]){
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        max = array[n1];
        minimum = array[0];
        System.out.println(minimum);
        System.out.println(max);
    }
    public int secondLargest(int[] array){
        int n = array.length;
        int s = 0;
        for (int i = 0; i < n - 1; i++){
            int min = i;
            for (int j = i + 1; j < n; j++){
                if (array[j] < array[min]){
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        s = array[1];
        return s;
    }
    public int duplicate(int[] array){
        int d = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] == (array[j])){
                    d = array[i];
                }
            }
        }
        return d;
    }
}
