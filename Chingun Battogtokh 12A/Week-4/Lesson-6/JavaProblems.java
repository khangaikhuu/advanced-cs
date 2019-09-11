
/**
 * Write a description of class JavaProblems here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JavaProblems
{
  public void kekString(String A) 
  { 
      String a = "Hello"; 
      A = a.concat(A); 
      System.out.println(a); 
}
public int sum(int x, int y) 
{ 
    return x + y;
} 
public int divide(int x, int y) 
{ 
    return x/y; 
} 
public int add(int A, int B, int C, int D) 
{ 
    return -A + B * A + (C + D) % D - C + -A * A / D + A + C / A * 2 - D % A; 
} 
public void multiply()
{ 
int a = 5;
{ 
    for(int i = 1; i < 10; i++) 
    { 
        System.out.println(i * a); 
    } 
} 
}
public double Average(double a, double b, double c) 
{ 
    double x = a + b + c; 
    return x / 3; 
} 
public void swap(int A, int B)
{ 
    int temp = 0; 
    temp = A; 
    A = B; 
    B = temp; 
    
    System.out.println(A); 
    System.out.println(B);
} 
} 

