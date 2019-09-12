
/**
 * Write a description of class ClassWork here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClassWork
{
    public void neg(int x){
        if (x < 0){
            System.out.println("negative");
        }
        else if (x > 0){
            System.out.println("positive");
        }
        else {
            System.out.println("zero");
        }
    }
    public int great(int x, int y, int z){
        int max = 0;
        if (x > y && x > z){
            return x;
        }
        else if (y > x && y > z){
            return y;
        }
        else if (z > x && z > y){
            return z;
        }
        return max;
    }
    public void floating(int x){
        if (x < 0){
            System.out.println("negative");
        }
        else if (x > 0){
            System.out.println("positive");
        }
        else {
            System.out.println("zero");
        }
        if (Math.abs(x) < 0){
            System.out.println("small");
        }
        if (Math.abs(x) > 1000000){
            System.out.println("large");
        }
    }
    public void weekday(int x){
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(week[x - 1]);
    }
    public void natural(){
        for (int i = 1; i < 11; i++){
            System.out.println(i);
        }
    }
    public void average(int a, int b, int c, int d, int e){
        int sum = a + b + c + d + e;
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + (sum / 5));
    }
    public void pattern(int n){
        for (int i = 1; i <= n; i ++){
            for (int j = 0; j < i; j++){
                System.out.print(i);
            }
            System.out.println("");
        }
    }
    public void cube(int x){
        for (int i = 1; i <= x; i ++){
            System.out.println(Math.pow(i, 3));
        }
    }
    public void tableM(int x, int y){
        for (int i = 0; i <= y; i++){
            System.out.println(y * i);
        }
    }
}
