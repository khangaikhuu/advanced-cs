
/**
 * Write a description of class class1 here.
 *
 * @author (Juan)
 * @version (a version number or a date)
 */
public class class1
{
    public void even(int[] a)
    {
        for(int i=0; i<a.length;i++)
        {
            if(a[i]%2==0)
            System.out.println("num is even");
            else
            System.out.println("num is odd");
        }
    }
    
    public void greet(String[] a)
    {
        for(int i=0; i<a.length;i++)
        {
        String s=a[i];
        s=s.concat(a[++i]);
        System.out.println(s);
        }
    }
        
        
    }
