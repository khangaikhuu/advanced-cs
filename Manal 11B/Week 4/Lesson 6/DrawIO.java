
/**
 * Write a description of class DrawIO here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DrawIO
{
    private String a = "";
    private int b = 0;
    public void checkValue(){
        if (b < 0){
            a = "Hello World";
        }
        else {
            a = "World Hello";
        }
    }
    public String getA(){
        return a;
    }
    private double[] d = {1.1, 1.2, 1.3, 1.4, 1.5};
    public void printArray(){
        for (int i = 0; i < d.length; i++){
            System.out.println(d[i]);
        }
    }
    private double[] c = {1.5, 1.2, 1.3, 1.4, 1.5};
    private double max = 0;
    public void maxValue(){
        for (int i = 0; i < c.length; i++){
            System.out.println(c[i]);
            if (max <= c[i]){
                max = c[i];
            }
        }
    }
}
