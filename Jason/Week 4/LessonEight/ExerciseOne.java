
/**
 * Write a description of class ExerciseOne here.
 *
 * @author (Jason)
 * @version (12.09.2019)
 */
public class ExerciseOne
{
public static void main(String[] args) 
{
      int[] myNumbers = new int[]{1, 2, 3, 4, 5};
      int sum = 0;
      for (int i = 0; i < myNumbers.length; ++i)
      sum = sum + myNumbers[i];
      double average = sum / myNumbers.length;
      System.out.println("Average value of array elements is : " + average);
}
public static void myValue(String[] args) {
        int[] num = {3, 4, 5, 6, 7, 8};
        int a = 10;
        boolean found = false;
        for (int n : num) {
            if (n == a) {
                found = true; break;
            }
        }
        if(found)
            System.out.println(a + " is found.");
        else
            System.out.println(a + " is not found.");
}
}

