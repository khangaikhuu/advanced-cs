
/**
 * Write a description of class ExcerciseOne here.
 *
 * @author (Anudari)
 * @version (18/09/19)
 */
public class ExcerciseOne

{  public int sum(int n)
    {
        if ( n >= 1)
        {
            return sum( n - 1) + n;
        }
        return n;
    }
    
    public int powerof10(int n)
    {
        if ( n == 0)
        {
            return 1;
        }
        return powerof10(n - 1) + 10;
    }
    
    public int powerof10ForLoop(int n)
    {
        int powerof10 = 1;
        for( int i = 0; i < n; i++)
        {
            powerof10 = powerof10 * 10;
        }
        return powerof10;
    }
    
    public int fibonacci(int n)
    {
        if ( n <= 1)
        {
            return n;
        }
        return fibonacci(n - 1) + fibonacci( n - 2);
    }
    
   
    public static int[] bubbleSort(int[] array) 
    { 
        for (int i = 0; i < array.length; i++) 
        { 
            for (int j = array.length -1; j > i; j--) 
            { 
                if (array[j] < array[j - 1]) 
                { 
                   swap(array, j, j-1);
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


