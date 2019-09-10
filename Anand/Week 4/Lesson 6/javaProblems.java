
/**
 * Write a description of class javaProblems here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class javaProblems
{
    public void concatString(String S)
    {
        String s = "Hello "; 
        s = s.concat(S); 
        System.out.println(s); 
    }
    public int sum (int x, int y)
    {
        return x+y;
    }
    public int divide (int x, int y)
    {
        return x/y;
    }
    public int add (int A, int B, int C, int D)
    {
        return -A + B * A + (C+D) % D - C + -A*A / D + A + C / A * 2 - D % A;
    }
    public void multiply()
    {
        int a = 8;
        for (int i = 1; i < 11; i++)
        {
            System.out.println(i*a);
        }
    }
    public double average (double x, double y, double z)
    {
        double a = x + y + z;
        return a / 3;
    }
    public void swap (int a, int b)
    {
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a =" + a);
        System.out.println("b =" + b);
    }
    public void manalsFace()
    {
        System.out.println("+++++++++");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  |");
        System.out.println(" | '-' |");
        System.out.println(" +-----+");
    }
}
