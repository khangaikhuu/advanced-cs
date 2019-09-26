
/**
 * Write a description of class ExcerciseOne here.
 *
 * @author (Anudari Sukhbat)
 * @version (12/09/19)
 */
public class ExcerciseOne
{
   private int[] myArray = {1, 2, 3, 4, 5};
   public void getAverage()
   {
   int sum = 0;
   for( int i=0; i < myArray.length ; i++)
   {
       sum = sum + myArray[i];
       double average = sum / myArray.length;
      System.out.println("Average vale of the array elements is" + average);
       
    }
    
}
public void checkMyArray (int num)
{
    for(int n : myArray)
    {
        if(num == n)
        {
            System.out.println("true");
        }
        else 
        {
            System.out.println("false");
        }
    }
   
}
public void findMyArray(int num1)
{
    for( int i = 0; i < myArray.length; i ++)
    {
        if (myArray[i] == num1)
          {
             System.out.println(i);
            }
        else 
        { 
            System.out.println(-1); 
        }
        
           
}
}
public void getMaxValue()
{
    int maxValue = myArray[0];
    for(int i=1; i < myArray.length; i ++)
    {
        if(myArray[i] > maxValue)
        {
            maxValue = myArray[i];
            
            System.out.println("the maximum value is" + maxValue);
        }

}
}

public void getMinValue()
{
    int minValue = myArray[0];
    for(int i=1; i< myArray.length;i++)
    {
        if(myArray[i] < minValue)
        {
            minValue = myArray[i];
      
            System.out.println( "the min value is" + minValue);
        }
    }
}
public void getSecondLargerst()
{
    
    int secondLargest = myArray[0];
    for(int i = 0; i < myArray.length; i++)
    {
        System.out.println(myArray[i] + "\t");
    }
    for (int i = 0; i < myArray.length; i++)
    {
        if(myArray[i] > secondLargest) 
        { 
            secondLargest = myArray[i];
            System.out.println( "Second largest number is:" + secondLargest);
        }
        
}
}
}
