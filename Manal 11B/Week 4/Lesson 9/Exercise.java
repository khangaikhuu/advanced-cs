
/**
 * Write a description of class Exercise here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exercise
{
    public void even(){
        int[] array = {3, 4, 3, 1, 4, 5};
        for (int i = 0; i < array.length; i++){
            if (array[i] == 0){
                System.out.println(array[i] + " is even");
            }
            else {
                System.out.println(array[i] + " is odd");
            }
        }
    }
    public void concat(){
        String[] str = {"Hello", "World", "My", "Name", "Is", "Little", "Wonder"};
        for (int i = 0; i < str.length; i++){
            String s = str[i];
            s = s.concat(str[i]);
            System.out.println(s);
        }
    }
}
