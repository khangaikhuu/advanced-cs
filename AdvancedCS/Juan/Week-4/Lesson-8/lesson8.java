
/**
 * Write a description of class lesson8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class lesson8
{
    
    public int arrayAv(int[] array)
    {
        int sum=0;
        for(int i=0; i<array.length;i++)
        {
            sum+=array[i];
        }
        return sum/5;
    }
    
    public boolean container(int[] array,int find)
    {
        boolean contain=false;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==find)
            {
                contain = true;
            }
        }
        return contain;
    }
    
    public int indexer(int[] array, int num)
    {
       int index = 0;
       for(int i=0;i<array.length;i++)
        {
            if(array[i]==num)
            {
                index++;
            }
        }
        if(index==0)
        {
        index=-1;
        }
       return index;
    }
    
    public void maxMin(int[] array)
    {
        int max = 0;
        int min = 0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>array[i++])
            {
                max=array[i];
                min=array[i++];
            }
            else
            {
                max=array[i++];
                min=array[i];
            }
        }
        System.out.println("Max is: "+max);
        System.out.println("Min is: "+min);
    }
    
    public void large2(int[] array)
    {
        int max = 0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>array[i++])
            {
                max=array[i];
            }
            else
            {
                max=array[i++];
            }
        }
        for(int j = 0; j<array.length;j++)
        {
            if(array[j]==max)
            continue;
            else if(array[j]>array[j++])
            {
                max=array[j];
            }
            else
            {
                max=array[j++];
            }
        }
        
        System.out.println(max);
    }
    
    public int duplicate(int [] array)
    {
        int hold = 0;
        for(int i = 0; i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
            if(array[i]==array[j])
            {
                hold=array[j];
            }
            }
        }
        return hold;
    }
}
