
/**
 * Write a description of class ExcerciseOne here.
 *
 * @author (Anudari Sukhbat)
 * @version (a version number or a date)
 */
public class ExcerciseOne
{
    private int[] array = {3, 4, 3, 1, 4, 5};
    
    public void getArray()
    {
        for( int i = 0; i < array.length ; i ++)
        {
            if(array[i]%2==0 )
            {
                System.out.println(i + "is even");
            }
            else
            {
                System.out.println( i + "is not even");
            }
            i = i + 1;
        }
}
private String[] str = {"Hello", "World", "My", "Name", "is", "Little", "Wonder"};
public void getConcat()
{
    for( int i = 0; i < str.length ; i ++)
    {
        String s = str[i];
        s = s.concat(str[i]);
        System.out.println(s);
    }
   
}
}