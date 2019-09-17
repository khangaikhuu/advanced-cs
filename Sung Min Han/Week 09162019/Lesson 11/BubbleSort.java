/**
 * Write a description of class BubbleSort here.
 *
 * @author (Sung Min)
 * @version (9172019)
 */
public class BubbleSort
{
    public static int[] buubleSort(int[] arr)
    {
        int n = arr.length;
        int temp = 0; 
        for(int i = 0; i < n; i++)
        {
            for(int j = n - 1; j > i; j--)
            {
                if(arr[j - 1] > arr[j])
                {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    
    public static void main(String[] args)
    {
        int arr[] = {2, 66, 3, 4, 56};
        
        System.out.println("Array at the start");
        for(int i = 0; i < arr.length; i++)
        {
            
        }
    }
}
