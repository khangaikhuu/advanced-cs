public class Exercise
{
    private int[] myArray = {1,2,3,4,5,6,7,8,9,10};
    private int sum= 0;
    public int calculateMyArray()
    {
        for(int i = 0; i<myArray.length; i++)
        {
            sum += myArray[i];
        }
        return (sum);
    }
}