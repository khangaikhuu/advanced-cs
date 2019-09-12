
/**
 * Write a description of class javaProblems here.
 *
 * @author (Bilguundalai)
 * @version (12/9/2019)
 */
public class javaProblems
{
    public int getAverage(int[] array)
    {
        int sum = 0;
        int a = array.length;
        for ( int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }
    
        return sum / a; 
    }
    public boolean value(int[] array, int x)
    {
        boolean b = false;
        for (int i = 0; i < array.length; i++)
        {
            if (x == array[i])
            {
                b = true;
                break;
            }
        }
        return b;
    }
    public int index(int[] array, int x)
    {
        int index = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (x == array[i])
            {
                return index;
            }
        }
        return index;
    }
    public void maxMin(int[] array)
    {
        int max = 0;
        int minimum = 0;
        int n = array.length;
        
        int n1 = array.length - 1;
        for (int i = 0; i < n - 1; i++)
        {
            int min = i;
            for (int b = i + 1; b < n; b++)
            {
                if (array[b] < array[min])
                {
                    min = b;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        max = array[n1];
        minimum = array[0];
        System.out.println(minimum);
        System.out.println(max);
    }
    public int secondLargestElement(int[] array)
    {
        int n = array.length;
        int s = 0;
        for (int i = 0; i < n - 1; i++)
        {
            int min = i;
            for (int b = i + 1; b < n; b++)
            {
                if (array[b] < array[min])
                {
                    min = b;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        s = array[1];
        return s;
    }
    public int duplicate(int[] array)
    {
        int d = 0;
        for (int i = 0; i < array.length; i++)
        {
            for (int b = i + 1; b < array.length; b++)
            {
                if (array[i] == (array[b])) 
                {
                    d = array[i];
                }
            }
        }
        return d;
    }

}
