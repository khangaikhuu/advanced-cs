
/**
 * Write a description of class mergeSort here.
 *
 * @author (Hannah)
 * @version (26.09.2019)
 */
public class mergeSort
{
    public int [] a;
    public int n;
    
     public void mergeSort(int [] a, int n)
    {
      for(int i = 0; n < 2; i++)
      {
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
         for(int i = 0; i < mid; i++)
         {
          1[i] = a[i];
          for(int i = 0; i < n; i++)
          {
              r[i - mid] = a[i];
              mergeSort(1, mid);
              mergeSort(r, n - mid);
              merge(a,l,r,mid,n - mid);
            }
        }
        }
    }
     public int mergeSort(int [] a, int n)
    {
      if(n < 2)
      {
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
        for(int i = 0; i < mid; i++)
         {
          1[i] = a[i];
          for(int i = 0; i < n; i++)
          {
              r[i - mid] = a[i];
              mergeSort(1, mid);
              mergeSort(r, n - mid);
              merge(a,l,r,mid,n - mid);
            }
        }
        }
      else
      {
         return i = i + 1; 
        }
    }
}
