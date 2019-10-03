
/**
 * Write a description of class ExerciseOne here.
 *
 * @author (Hayeon Lee)
 * @version (18/09/2019)
 */
public class ExerciseOne
{
     public int sum(int n)
     {
        if(n >=1) {
            return sum(n -1) + n;
        }
        return n;
        }
    
    
    //10^2
     
     public int powerOf10(int n)
     {
         if (n==0)
         {
             return 1;
            }
            return powerOf10(n - 1) * 10;
        }
        public int powerOf10ForLoop(int n)
        {
            int powerOf10 = 1;
            for (int i = 0; i < n; i++)
            {
                powerOf10 = powerOf10 * 10;
            }
            return powerOf10;
        
        }
    
    //Recursive function
     //Fibonaci numbers: 0,0,1,2,3,5,8,13,21,34....
     //F(X) = F(X-1) + F(X-2)
     
     public int fibonacci(int n)
     {
         if(n <= 1){
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
                    swap(array,j,j-1);
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
