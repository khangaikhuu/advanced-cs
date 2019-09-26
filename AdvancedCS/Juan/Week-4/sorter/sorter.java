import java.util.Arrays; 

/**
 * Write a description of class sorter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sorter
{
    public int[] sort(int a[])
    {
        int temp=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i; j>0;j--)
            {
                if(a[j-1]<a[j])
                {
                    temp = a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
                else
                {
                break;
                }
            }
        }
        return a;
    }
    public void arrayChecker(int a[], int b[],int c[])
    {
        System.out.println("is arra equals to arrb : " + 
                                    Arrays.equals(a, b)); 
        System.out.println("is arra equals to arrc : " + 
                                    Arrays.equals(a, c)); 
    }
}
