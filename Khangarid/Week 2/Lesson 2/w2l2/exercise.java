public class exercise
{
    private String a = "";
    private int b = 0;
    private double[] c = {1,2,3,4};
    private int i = 0;
    
    public void changeA()
    {
        if (b < 0)
        {
            a = "Hello World";
        }
        else
        {
            a = "World Hello";
        }
    }
    public String getA()
    {
        return a;
    }
    public void conditional()
    {
        for (i = 0; i < c.length; i++)
        {
            System.out.println(c[i]);
        }
    }
}
