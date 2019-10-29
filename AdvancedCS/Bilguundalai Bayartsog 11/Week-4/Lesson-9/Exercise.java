
/**
 * Write a description of class Exercise here.
 *
 * @author (Bilguundalai)
 * @version (13/9/2019)
 */
public class Exercise
{
    public void array()
    {
        int[] array = {3, 4, 3, 1, 4, 5};
        {
            for( int i = 0; i < array.length; i++)
            {
                if(array[i] % 2 ==0)
                {
                    System.out.println(i + "is even");
                }
                else
                {
                    System.out.println(i + "is not even");
                }
            }
        }
    }
    public void String()
    {
        String[] str = {"Hello", "World", "My", "Name", "is", "Little", "Wonder"};
        {
            for (int i = 0; i < str.length; i++)
            {
                String s = str[i];
                s = s.concat(str[i]);
                System.out.println(s);
            }
        }
    }
}
