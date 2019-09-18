import java.util.Arrays;
/**
 * Write a description of class Constant here.
 *
 * @author (Manal)
 * @version (17.09.19)
 */
public class Constant
{
    private int a = 5;
    private int b = 6;
    private final static double PI = 3.14;
    private static int[] array = {1, 2, 3};
    private static int[] array1 = {1, 2, 3};
    public static boolean compareArrays(){
        return Arrays.equals(array, array1);
    }
    public static double area(int r){
        return Math.pow(r, 2) * PI;
    }
    public void changeA(int b, int c){
        a = b;
        b = c;
    }    
    public void changeA(int b){
        a = b;
    }
    public int getA(){
        return a;
    }
}

