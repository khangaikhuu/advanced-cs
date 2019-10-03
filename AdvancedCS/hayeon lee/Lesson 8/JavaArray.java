
/**
 * Write a description of class JavaArray here.
 *
 * @author (Hayeon Lee)
 * @version (12/09/2019)
 */
public class JavaArray
{
    public  void myAverage()
    {
        int [] num = {1,2,3,4,5};
        System.out.println ((num[0]+num[1] + num [2] + num[3] + num[4])/ 5);
}
   public void myValue()
   {
       int [] number= {3,4,5,6,7,8};
       int a = 10;
       
       for(int i = 0; i < number.length; i++)
       {
           if(i == number[i]){
               System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
    }
    public void myIndex()
    {
        int [] index = {3,4,1,2,3,5};
        int b = 4;
        for(int i = 0; i < index.length; i++)
       {
           if(i == index[0]){
               System.out.println("0");
            }
            else if(i == index[1]){
                System.out.println("1");
            }
            else if(i == index[2]){
                System.out.println("2");
            }
            else if(i == index[3]){
                System.out.println("3");
            }
            else if(i == index[4]){
                System.out.println("4");
            }
            else {
                System.out.println("5");
            }
        }
    }
    public void maxMin()
    {
        int [] maxmin = {3,3,1,3,0,-1,10};
        for(int i = 0; i < maxmin.length; i++)
       {
           if ( i == 10) {
               System.out.println("Maximum number in array is:" + 10);
            }
            else if ( i == -1) {
                System.out.println("Minimum number in array is" + -1);
            }
        }
    }
    public void secondEle()
    {
        int [] seclarge = {3,3,1,3,0,-1,10};
        int max = seclarge[6];
        int secmax = seclarge[0];
        System.out.println(secmax);
    }
}
