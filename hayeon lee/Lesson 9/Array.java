
/**
 * Write a description of class Array here.
 *
 * @author (Hayeon Lee)
 * @version (13/09/2019)
 */
public class Array
{
    public void arrayOne()
    {
        int [] array = {3,4,3,1,4,5};
        int i = 0;
        for(i = 0; i < array.length; i++)
        {
            if(array[i] % 2 == 0) {
                System.out.println(i + "is even");
            }
            else {
                System.out.println(i + "is not even");
            }
            i = i + 1;
        }
    }
    public void arrayTwo()
    {
        String [] str = {"Hello", "World", "My", "Name", "is","Little", "Wonder"};
        int i = 0;
        String s = str[i];
        for(i = 0; i < str.length; i++)
        {
            s = s.concat(str[i]);
            System.out.println(s);
            i = i + 1;
            
        }
    }
}
