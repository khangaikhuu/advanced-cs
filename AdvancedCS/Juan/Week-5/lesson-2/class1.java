
/**
 * Write a description of class class1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class class1
{
    public int sum(int n)
    {
        if(n >=1)
        {
        return sum(n-1)+n;
    }
        return n;
    }
    
    public int fibonacci(int n)
    {
        if(n<=1)
        return n;
        
        return fibonacci(n-1)+ fibonacci(n-2);
    }
    
    public int powerOf10(int a)
    {
        if(a==0)
        {
            return 1;
        }
        return powerOf10(a-1)*10;
    }
    public int powerOf10ForLoop(int n)
    {
        int powerOf10= 1;
        for(int i =0; i<n;i++)
        {
            powerOf10 = powerOf10*10;
        }
        return powerOf10;
    }
    
    public static int[] bubbleSort(int[] array) 
    { 
        for (int i = 0; i < array.length; i++) 
        { 
            for (int j = array.length -1; j > i; j--) 
            { 
                if (array[j] < array[j - 1]) 
                { 
                    swap(array, j,j-1);
                } 
            } 
        }
        return array;
    }
    
    public static int [] swap(int[] array, int from, int to)
    {
        int temp = array[from]; 
        array[from] = array[to]; 
        array[to] = temp;
        return array;
    }
    
    
}
