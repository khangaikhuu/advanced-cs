
/**
 * Write a description of class ExerciseOne here.
 *
 * @author (Erkhem)
 * @version (1.0)
 */
public class ExerciseOne
{
   public void avg(int[] arry)
   {
       int sum = 0;
       for(int i = 0 ; i<arry.length; i++)
       {
           sum+= arry[i];
        }
        System.out.println( sum/arry.length);
    }
    
    public void find(int a,int[] arry)
    {
        int chosen;
        for(int i: arry)
        {
            if(i==a) System.out.println("TRUE");
        }
        System.out.println("FALSE");
    }
    
    public void index(int a, int[] arry)
    {
        for(int i= 0; i<arry.length ; i++)
        {
            if(arry[i]==a) System.out.println("i");
        }
        System.out.println("-1");
    }
    
    public void maxMin(int[] arry)
    {
        int chosenMax= 0;
        for(int i = 0; i<arry.length ; i++)
        {
            if(chosenMax<arry[i]) chosenMax=arry[i];
        }
        int chosenMin =chosenMax;
        for(int i = 0; i<arry.length ; i++)
        {
            if(chosenMin>arry[i]) chosenMin = arry[i];
        }
        System.out.println("Max="+chosenMax+"\n" +"Min="+chosenMin);
    }
    public void secLarge(int[] arry)
    {
        int chosenMax= 0;
        int chosenMax2= 0;
        int[] arrytemp = arry; 
        for(int i = 0 ; i<arry.length ; i++)
        {
            if(chosenMax<arry[i]) chosenMax=arry[i]; 
            arrytemp[i]=chosenMax;
        }
        chosenMax2 = arrytemp[arry.length-2];
    }
    
    public void dup(int arry[])
    {
        for(int i = 0 ; i<arry.length-1 ; i++)
        {
            for(int k =i+1 ; k<arry.length; k++)
            if(arry[i]==arry[k]) System.out.print(arry[k]+",");
        }
    }
    
 
           
}
