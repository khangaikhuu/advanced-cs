public class sorting
{
    public int[] sorting(int a[])
    {
        int temp = 0;
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 1; j > 0; j--)
            {
                if(a[j-1]>a[j])
                {
                    temp = a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }
                else
                {
                    break;
                }
            }
    }
    return a;
}
}
