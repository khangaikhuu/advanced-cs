
/**
 * Write a description of class ExerciseOne here.
 *
 * @author (khulan)
 * @version (09.12.19)
 */
public class ExerciseOne
{
  public void sumAverage()
  {
      int[] num = new int []{1,2,3,4,5};
      int sum = 0;
      for(int i = 0; i < num.length; i++)
          {
              sum = sum + num[i];
          }
      double avg = sum / num.length;
      {
          System.out.println("The average value of the array is: " + avg);
        }
  }
  public void specificValue()
  {
      int[] num = {3, 4, 5, 6, 7, 8};
      int toFind = 10;
      boolean found = false;
      for(int n: num)
      {
          if(n == toFind)
          {
              found = true; break;
            }
        }
      if(found)
      {
          System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }
public void getMinMax()
    {
    int array[] = new int[]{3, 1, 3, 10};

    int max = getMax(array);
    System.out.println("Maximum Value is: "+max);
 
    int min = getMin(array);
    System.out.println("Minimum Value is: "+min);
  }
  public int getMax(int[] inputArray)
  { 
    int maxValue = inputArray[0]; 
    for(int i=1;i < inputArray.length;i++)
    { 
      if(inputArray[i] > maxValue)
      { 
         maxValue = inputArray[i]; 
      } 
    } 
    return maxValue; 
}
  public int getMin(int[] inputArray)
  { 
    int minValue = inputArray[0]; 
    for(int i=1;i<inputArray.length;i++)
    { 
      if(inputArray[i] < minValue)
      { 
        minValue = inputArray[i]; 
      } 
    } 
    return minValue; 
  } 
}
