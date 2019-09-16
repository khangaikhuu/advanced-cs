/**
 * Write a description of class Organize here.
 *
 * @author (Tsengel)
 * @version (16.09.2019)
 */
public class Insertion
{
  public void getInsertion(int arr[])
  {
      int i, key,j;
      for (i = 1; i <arr.length; i++)
      {
          key = arr[i];
          j = i - 1;
          
          while(j >= 0 && arr[j] > key)
          {
              arr[j + 1] = arr[j];
              j = j - 1;
            }
           arr[j + 1] = key;
        }
    }
}
