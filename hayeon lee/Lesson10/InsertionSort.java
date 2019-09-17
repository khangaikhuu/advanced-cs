
/**
 * Write a description of class InsertionSort here.
 *
 * @author (Hayeon Lee)
 * @version (16/09/2019)
 */
public class InsertionSort
{
    
    int i = 0;
    public void insertSort(int a[])
    {
        for(i = 0; i < a.length; i++)
        {
            int j = i;
            while (j > 0) {
                if(a[i-1] > a[i]){
                    int temp = a[j-1];
                    a[j-1] = a[i];
                    a[j] = temp;
                }
                else {
                    break;
                }
                j--;
            }
            
         for (int k = 0; k < a.length; k++)
         {
             System.out.println(a[0]);
             System.out.println(a[1]);
             System.out.println(a[2]);
             System.out.println(a[3]);
             System.out.println(a[4]);
             System.out.println(a[5]);
             System.out.println(a[6]);
            }
    }
}

        
}
