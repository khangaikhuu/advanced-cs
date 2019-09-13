public class flowchart
{
    public void array(int[]a)
    {
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] %2 == 0)
            { System.out.println(i+ "is not even");
            } else
            { System.out.println(i+ "is even");
            }
        }
    }
    
    public void string()
    {
        String[] str = {"Hello", "World", "My", "Name", "Is", "Little", "Wonder"};
        for (int i = 0; i < str.length; i++)
        {
            String s = str[i];
            s = s.concat(str[i]);
            System.out.println(s);
        }
    }
}
