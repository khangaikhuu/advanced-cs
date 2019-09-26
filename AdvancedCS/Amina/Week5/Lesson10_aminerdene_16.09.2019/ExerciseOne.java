
/**
 * Write a description of class ExerciseOne here.
 *
 * @author (Amina)
 * @version (16.09.2019)
 */
public class ExerciseOne
{
     public void insertionsort(int Arr[])
     {
         int  key = 1, j = 0;
          for (int i = 0 ; i < Arr.length; i++)
         {
             key = Arr[i];
             j = i - 1;
         }
         while (j >= 0 &&Arr[j] > key)
         {
             Arr[ j + 1 ] = Arr [j];
             j = j - 1;
            
            Arr [ j + 1 ] = key;
        }
        
         for (int i = 0 ; i < Arr.length; i++)
         {
             System.out.println(Arr[i]);
         }
     }
    }
