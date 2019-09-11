
/**
 * Write a description of class ExerciseTwo here.
 *
 * @author (Erkhem)
 * @version (9/10/19)
 */
public class ExerciseTwo
{
    public String concHello(String str)
    {
        return "Hello " + str;
    }
    
    public int sumOfTwo(int a, int b)
    {
        return a+b;
    }
    
    public int quotientOfTwo(int a , int b)
    {
        return a/b;
    }
    
    public int formulaOfFour(int a, int b, int c, int d)
    {
        return -a+b*a+(c+d)%d-c+-a*a/d+a+c/a*2-d%a;
    }
    
    public void printMultTable(int a)
    {
        for(int i = 1; i<11 ; i++)
        {
            System.out.println(a*i);
        }
    
    }
    
    public int avgOfThree(int a , int b , int c)
    {
        return (a+b+c)/3;
    }
    
    public void swapInput(int a , int b)
    {
        int placeholder = b;
        b = a;
        a = placeholder;
    }
    
    public void printFace()
    {
        System.out.println("+\"\"\"\"\"\"+");
        System.out.println("[|oo|]");
        System.out.println("|^|");
        System.out.println("|'_'|");
        System.out.println("+_____+");
    }
    
    public int maxArrayElement(int[] a)
    { 
        int chosen = 0;
        for(int i = 0; i<a.length; i++)
        {
            if(chosen<a[i])
            {
                chosen =a[i];
            }
        }
        return chosen;
    }
    
    public void decToBinary(int a)
    {
      String binaryValue = "";
      while (a > 0)
      {
          int bin = a % 2;
          binaryValue += String.valueOf(bin);
          a = a/2;
      }
      StringBuilder str = new StringBuilder(binaryValue);
      System.out.print(str.reverse());
    }
    
    public int valueOfDigits(int a)
    {
        int sum= 0;
        String stringA = String.valueOf(a);
        for(int i = 0; i < stringA.length() ; i++)
        {
            sum+=Integer.parseInt(stringA.substring(i, i+1));
        }
        return sum;
    }
            
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     /**
      if(a%2 != 0)
      {
         binaryValue = binaryValue + "1";
         a--;
       }
       while(a!=1)
       {
           a/=2;
           binaryDigits++;
       }
       for(int i = 0; i<binaryDigits ; i++)
       {
           binaryValue = "0"+binaryValue;
        }
        binaryValue = "1" + binaryValue;
       return (Integer.parseInt(binaryValue));*/
}
