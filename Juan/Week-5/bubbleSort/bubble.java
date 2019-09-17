
/**
 * Write a description of class bubble here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bubble
{
    private int[] a;
    public int[] sort(int[] a)
    {
        int temp = 0;
    for(int i =0; i<a.length;i++)
    {
        for(int j=i;j>0;j--)
        {
            if(a[j]<a[j-1])
            {
                temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
            }
            else
            break;
        }
    }
    return a;
    }
}
