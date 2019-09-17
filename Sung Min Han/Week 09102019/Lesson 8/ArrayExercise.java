/**
 * Write a description of class ArrayExercise here.
 *
 * @author (Sung Min)
 * @version (9122019)
 */
public class ArrayExercise
{
    private int num2[] = {3, 4, 5, 6, 7, 8};
    private int num45[] = {3, 3, 1, 3, 0, -1, 10};
    
    public static void findAv()
    {
        int[] num1 = new int[]{1, 2, 3, 4, 5};
        int sum = 0;
        
        for(int i = 0; i < num1.length; i++)
        sum = sum + num1[i];
        double average = sum / num1.length;
        System.out.println("Average value of this array is : " + average);
    }
    public static void findIndex()
    {
        int num3[] = {3, 4, 1, 2, 3, 5};
        int target = 4;
        for (int i = 0; i < num3.length; i++)
		if (num3[i] == target)
			System.out.println(i);
		else 
		System.out.println(-1);
    }
    
    public int max(int [] array) {
      int max = 0;
     
      for(int i=0; i<array.length; i++ ) {
         if(array[i]>max) {
            max = array[i];
         }
      }
      return max;
   }
   public int min(int [] array) {
      int min = array[0];
     
      for(int i=0; i<array.length; i++ ) {
         if(array[i]<min) {
            min = array[i];
         }
      }
      return min;
   }
   public static void findMaxMin() {
      int[] num4 = {3, 3, 1, 3, 0, -1, 10};
      ArrayExercise m = new ArrayExercise();
      System.out.println("Maximum value in the array is::"+m.max(num4));
      System.out.println("Minimum value in the array is::"+m.min(num4));
   }
}
