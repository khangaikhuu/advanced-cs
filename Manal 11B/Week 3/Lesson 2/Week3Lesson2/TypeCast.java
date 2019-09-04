
/**
 * Write a description of class TypeCast here.
 *
 * @author (Manal)
 * @version (04.09.2019)
 */
public class TypeCast
{
    private int a = 10;
    private double b;
    public int getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public void convert(int num){
        b = (double) num;
    }
    public double convertAdd(int x, int y){
        double c = (double) (x + y);
        return c;
    }
}
