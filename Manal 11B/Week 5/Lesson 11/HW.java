
/**
 * Write a description of class HW here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HW
{
    private final String h = "Hello World";
    public int index(){
        int[] array = {1, 2, 3};
        return array[1];
    }
    public static void sort(){
        int[] array = {12, -1, 3, 4, 1};
        for (int i = 0; i < array.length; i++){
            for (int j = array.length - 1; j > i; j--){
                if (array[j] < array[j - 1]){
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j-1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    public int myMethod(int a){
        return a;
    }
    public int myMethod(int a, int b){
        return a + b;
    }
    public static int subtract(int a, int b){
        return a - b;
    }
}
