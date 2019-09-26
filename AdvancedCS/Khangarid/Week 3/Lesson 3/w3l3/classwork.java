public class classwork
{
    public int sum(int n)
    {
        if (n >= 1) {
            return sum(n - 1) + n;
        }
        return n;
    }
    public int power(int n)
    {
        if (n == 0)
        {
            return 1;
        }
        return power(n - 1) * 10;
    }
    public int powerLoop(int n)
    {
        int power = 1;
        for (int i = 0; i < n; i ++)
        {
            power = power * 10;
        }
        return power;
    }
    public int fibonacci (int n)
    {
        if (n <= 1)
        {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
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