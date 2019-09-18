
/**
 * Write a description of class ExerciseTwo here.
 *
 * @author (Hannah)
 * @version (18.09.2019)
 */
public class ExerciseTwo
{
    // Recursive 
    // Fibonnaci numbers : 0,1,1,2,3,5,8,13,21,34 ...
    //F(X) = F(X-1) + F(X-2)
    public int fibonnaci(int n)
    {
        if(n <= 1)
        {
           return n;   
        }
        return fibonnaci(n-1) + fibonnaci(n-2);   
    }
    public int powerOf10(int n)
    {
       if(n == 0)
       {
           return 1;
        }
        return powerOf10(n-1) * 10;
    }
    public int powerOf10ForLoop(int n)
    {
       int powerOf10 = 1;
       for(int i = 0; i < n; i++)
       {
          powerOf10 = powerOf10 * 10;  
        }
        return powerOf10;
    }
    public int sum(int n)
    {
      if(n >= 1)
      {
         return sum(n - 1) + n; 
        }
      return n;
    }
}
