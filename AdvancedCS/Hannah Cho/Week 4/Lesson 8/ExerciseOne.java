
/**
 * Write a description of class ExerciseOne here.
 *
 * @author (Hannah)
 * @version (12.09.2019)
 */
public class ExerciseOne
{
    private int myArray[] = {1,2,3,4,5,6};
    private int i = 0;
    private int sum = 0;
    private int average;
    public void getAverage()
    {
      for (int i = 0; i <= 6; i++)
       {
           sum = sum + myArray[i];
        }
      average = (int)sum / i;
      System.out.println(average);
    }
    private int array[] = {1,2,3,4,5,6,7,8,9};
    public void checkArray(int num)
    {
       if (num <= 9)
      {
          System.out.println("This value exists");
          System.out.println(true);
        }
      else
      {
          System.out.println("This value does not exist");
          System.out.println(false);
        }
    }
    private int a[] = {4,7,2,8,9,1,4,3};
     public void findIndex(int a[], int b)
    {
        int length = a.length;
        int i = 0;
         if (a[i] == b)
        {
           System.out.println(i);  
        }
        else
        {
           System.out.println(-1);
        }
    }
    private int numbers[] = {-6,-4,0,2,5,8};
    public int value(int numbers[])
    {
      int maxValue = numbers[0];
      for(int i = 0; i < numbers.length; i++)
      {
          if(numbers[i] > maxValue)
          {
             maxValue = numbers[i]; 
            }
          }
      return maxValue;
    }
    public int minValue(int numbers[])
    {
      int minValue = numbers[0];
      for(int i = 0; i > numbers.length; i++)
      {
          if(numbers[i] < minValue)
          {
             minValue = numbers[i]; 
            }
          }
      return minValue;
    }
     public void getSecondLargestElement()
    {
        int arrayC[] = {3,3,1,3,0,-1,10};
        int secondLargest = arrayC[0];
         for (int i = 0; i < arrayC.length; i++)
        {
            System.out.println(arrayC[i]+"\t");
        }
         for (int i = 0; i < arrayC.length; i++)
        {
            if (arrayC[i] > secondLargest)
            {
                secondLargest = arrayC[i];
                System.out.println("Second largest number is:" + secondLargest);   
            }
        }
    }
}
