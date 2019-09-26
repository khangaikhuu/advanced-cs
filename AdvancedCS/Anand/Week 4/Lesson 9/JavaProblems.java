
/**
 * Write a description of class JavaProblems here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JavaProblems
{
    public void array(int[]array)
    {
        for(int i = 0; i < array.length; i++)
        {
            if(array[i]%2==0)
            {
                System.out.println(array[i] + "is even");
            }
            else
            {
                
                System.out.println(array[i]+"is not even");
            }
        }
    }
    public void String()
    {
       String[] str = {"hello","World","My","Name","is","Little","wonder"};
       for(int i = 0; i < str.length; i++)
       {
           String s = str[i];
           s = s.concat(str[i]);
           System.out.println(s);
        }
    }
    
}
