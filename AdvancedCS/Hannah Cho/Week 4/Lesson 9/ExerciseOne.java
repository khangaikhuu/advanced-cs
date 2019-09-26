
/**
 * Write a description of class ExerciseOne here.
 *
 * @author (Hannah)
 * @version (13.09.2019)
 */
public class ExerciseOne
{
     private int myArray[] = {3,4,3,1,4,5};
     public void getMyArray()
     {
         int i = 0;
         for (i = 0; i < myArray.length; i++)
         {
             if (myArray[i] % 2 == 0)
             {
                System.out.println(i + "is even");
                }
             else
             {
                System.out.println(i + "is not even");    
                }
             i = i + 1;
            }
        }
     private String mySecondArray[] = {"Hello","World","My","Name","is","Little","Wonder"};
     public void getMySecondArray()
     {
         int i = 0;
         String s = mySecondArray[i];
         for (i = 0; i < mySecondArray.length; i++)
         {
             s = s.concat(mySecondArray[i]);
             System.out.println(s);
            }
         i = i + 1;
        }
     
}
