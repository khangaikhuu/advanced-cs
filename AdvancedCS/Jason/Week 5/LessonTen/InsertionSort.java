
/**
 * Write a description of class InsertionSort here.
 *
 * @author (Jason)
 * @version (16.09.2019)
 */
public class InsertionSort
{
    public void insertionSort(int arr [], int n)
    {
    int i, key, j;
        for (i = 1; i < n ; i++)
        {
         key = arr[i];
         j = i-1;
        while (j >= 0 && arr[j] > key)
        {
         arr[j+1] = arr[j];
         j = j -1;
        }
        arr[j+1] = key;
    }
    for (i = 0; i < arr.length; i++)
    {
        System.out.println(arr[i]);
    }
    }
}