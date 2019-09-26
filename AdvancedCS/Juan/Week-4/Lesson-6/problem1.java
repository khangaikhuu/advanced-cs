
/**
 * Write a description of class problem1 here.
 *
 * @author (Juan)
 * @version (10/09)
 */
public class problem1
{
    private String a;
    private int b = 0;
    private double[] c = {5,4,7,5};
    private int i = 0;
    
    public void changeA()
    {
        if(b<0)
        {
        a="World Hello";
    }
        else
        {
        a="Hello World";
    }
    }
    
    public String getA()
    {
        return a;
    }
    
    
    public void conditional()
    {
        for(i=0;i<c.length;i++)
        {
            System.out.println(c[i]);
        }
    }
    
    
}
