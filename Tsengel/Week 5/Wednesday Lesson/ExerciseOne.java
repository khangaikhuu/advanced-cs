/**
 * Write a description of class ExerciseOne here.
 *
* @author  (Tsengel)
 * @version (18.09.2019)
 */
public class ExerciseOne
{
    // Recursive function
   //fibonacci numbers: 0,1,1,2,3,4,5,8,13,21,34
   // F(x) = F(x - 1) + F(x - 2)
    public int fibonacci(int n)
   {
        if (n <= 1)
       {
           return n;
        }
       return fibonacci(n - 1) + fibonacci(n - 2);
    }
   //10^2
    public int powerOf10(int n)
   {    
       if (n == 0)
       {
           return 1;
        }
        return powerOf10(n - 1) * 10;
    }
    public int powerOf10ForLoop(int n)
   {
       int powerOf10 = 1;
       for (int i = 1; i < n; i++)
       {
           powerOf10 = powerOf10 * 10;
        }
        return powerOf10;
    }
    
    public int sum(int n)
    {
        if (n >= 1)
        {
            return sum(n - 1) + n;
        }
        return n;
    }
    
    public static int[] bubbleSort(int[] array)
     {
       for (int i = 0; i < array.length; i++)
       {
           for (int j = array.length -1; j > i; j--)
           {
               if (array[j] < array[j - 1])
               {
                   swap(array, j, j - 1);
                }
            }
        }
        return array;
    }
   public static int[] swap(int[] array, int from, int to)
    {
      int temp = array[from];
      array[from] = array[to];
      array[to] = temp;
      return array;
    }
}
