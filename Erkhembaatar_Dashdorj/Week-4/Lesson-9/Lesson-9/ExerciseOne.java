
/**
 * Write a description of class ExerciseOne here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExerciseOne
{
    public void checkEven()
    {
        int[] arry = {3,4,3,1,4,5};
        for(int i =0 ; i<arry.length ; i++)
        {
            if(arry[i]%2==0)
            {
                System.out.println("Index " + i + "[" + arry[i] + "]" + " is even");
                
            }
            else
            {
                System.out.println("Index "+i + "[" + arry[i] + "]" + " is not even");
            }
        }
    }
    
    public void concatString()
    {
        String[] str = {"Hello", "World", "My", "Name", "Is", "Little", "Wonder"};
        for(int i = 0; i<str.length ; i++)
        {
            String s = str[i];
            s = s.concat(str[i]);
            System.out.println(s);
        }
    }
    
}
