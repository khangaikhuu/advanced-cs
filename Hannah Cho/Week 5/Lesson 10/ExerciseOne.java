
/**
 * Write a description of class ExerciseOne here.
 *
 * @author (Hannah)
 * @version (16.09.2019)
 */
public class ExerciseOne
{
      public void insertionSort(int a[], int N)
    {
        int i = 0, Key, J;
        for(i = 1; i < a.length; i++)
        {
         Key = a;
         J = i - 1;
         while(J >= 0 && a > Key);
        }
           for(i = 1; i < N; i++)
         {
            Key = a[i];
            J = i - 1;
            while(J >= 0 && a[J] > Key)
            {
                a (J + 1) = a(J);
                J = J - 1;
            }
        }
    }
}
