
/**
 * Write a description of class javaProblems here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class javaProblems
{
    public void concatString(String s){
        s = "Hello ".concat(s);
        System.out.println(s);
    }
    public int sum(int x, int y){
        return x + y;
    }
    public int divide(int x, int y){
        return x / y;
    }
    public int formula(int A, int B, int C, int D){
         return -A + B * A + (C+D) % D - C + -A*A / D + A + C / A * 2 - D % A;
    }
    public void table(int x){
        for (int i = 1; i < 11; i++){
            System.out.println(x * i);
        }
    }
    public double average(double x, double y, double z){
        double a = x + y + z;
        return a / 3;
    }
    public void swap(int A, int B){
        int temp = 0;
        temp = A;
        A = B;
        B = temp;
        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }
    public void face(){
        System.out.println("+\"\"\"\"\"\"+");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  |");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+");
    }
    public void arrayPrint(int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
    public void maxValue(int[] a){
        int n = a.length;
        for (int i = 0; i < n - 1; i++){
            int min = i;
            for (int j = i + 1; j < n; j++){
                if (a[j] < a[min]){
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
        int max = a.length - 1;
        System.out.println(a[max]);
    }
    public void binary(int x){
        int a;
        String b = "";
        while(x > 0){
            a = x % 2;
            b = b.concat(Integer.toString(a));
            x = x / 2;
        }
        StringBuilder r = new StringBuilder(b);
        System.out.print(r.reverse());
    }
    public void sumOfDigits(int x){
        String str = Integer.toString(x);
        int sum = 0;
        for (int i = 0; i < str.length(); i++){
            sum += Integer.parseInt(str.substring(i, i +1));
        }
        System.out.print(sum);
    }
}
