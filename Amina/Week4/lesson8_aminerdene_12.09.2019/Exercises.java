
/**
 * Write a description of class Exercises here.
 *
 * @author (Amina)
 * @version (12.09.2019)
 */
public class Exercises
{
     public void sumAverage()
     {
           int [] num = new int [] {1, 2, 3, 4, 5};
           int sum = 0; for(int i = 0; i < num.length; i++)
           {
               sum = sum + num[i];
            }
            double avg = sum / num.length;
            {
                System.out.println("The average value of the array");
            }
     }
     public void specificValue()
     {
         int[] num = {3,4,5,6,7,8};
         int toFind = 10;
         boolean found = false;
         for (int n: num)
         {
            if (n == toFind)
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
     public void getMinMax(int[] inputArr)
       {
         int maxValue = inputArr[0];
         for (int i = 1; i < inputArr.length; i++)
         {
             if(inputArr[i] > maxValue)
             {
                 maxValue = inputArr[i];
             }
         }
     }
    }
