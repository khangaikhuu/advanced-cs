
/**
 * Write a description of class Extra here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Extra
{
    public int sumOfArray(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }
    public int productOfArray(int[] array1){
        int sum = 1;
        for (int i = 0; i < array1.length; i++){
            sum = sum * array1[i];
        }
        return sum;
    }
    public double maxValue(double[] array2){
        int n = array2.length;
        for (int i = 0; i < n - 1; i++){
            int min = i;
            for (int j = i + 1; j < n; j++){
                if (array2[j] < array2[min]){
                    min = j;
                }
            }
            double temp = array2[min];
            array2[min] = array2[i];
            array2[i] = temp;
        }
        return array2[array2.length - 1];
    }
        public double minValue(double[] array3){
        int n = array3.length;
        for (int i = 0; i < n - 1; i++){
            int min = i;
            for (int j = i + 1; j < n; j++){
                if (array3[j] < array3[min]){
                    min = j;
                }
            }
            double temp = array3[min];
            array3[min] = array3[i];
            array3[i] = temp;
        }
        return array3[0];
    }
}
