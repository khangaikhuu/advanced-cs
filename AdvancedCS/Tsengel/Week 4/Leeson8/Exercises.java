/**
 * Write a description of class Exercises here.
 *
 * @author (Tsengel)
 * @version (12.09.2019)
 */
public class Exercises
{
   public void getAverage()
   {
       int[] arr = new int []{1,2,3,4,5};
       int sum = 0;
       for(int i = 0; i < arr.length; i++)
       {
           sum = sum + arr[i];
        }
        double average = sum / arr.length;
        {
        System.out.println(average);
       }
    }
    
   public void getValue()
   {
    int[] num = {1,2,3,4,5};
    int a = 10;
    boolean variable = false;
    for(int b : num)
       {
           if (b == a)
           {
                   variable = true; break;
            }
        }
        if (variable)
    {
        System.out.println(true);
    }
    else
    {
        System.out.println(false);
    }
    }
          public void getIndex(int arr[], int a)
   {
       if(arr == null)
       {
           return - 1;
        }
       int len = arr.length;
       int i = 0;
       while (i < len)
       {
           if(arr[i] == a)
           {
               return i;         
            }
            else
            {
                i = i + 1;
            }
        }
        return -1;
    }
   public int max(int [] array) 
   {
      int max = 0;
     
      for(int i = 0; i < array.length; i++ ) {
         if(array[i]>max) 
         {
            max = array[i];
         }
      }
      return max;
   }
   public int min(int [] array) 
   {
      int min = array[0];
     
      for(int i = 0; i < array.length; i++ ) {
         if(array[i]<min) 
         {
            min = array[i];
         }
      }
      return min;
   }
} 




