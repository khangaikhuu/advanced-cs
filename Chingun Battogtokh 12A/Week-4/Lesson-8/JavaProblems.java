
/**
 * Write a description of class JavaProblems here.
 *
 * @author (Chingun)
 * @version (12.09.2019)
 */
public class JavaProblems
{ 
   public int getAverage(int[] array)
      {
        int sum = 0;
        int a = array.length;

        for(int i = 0; i < array.length; i++)
        {
        	sum += array[i]; 
        }
        return sum / a; 
    }
   public boolean value(int[] array, int b)
   { 
       boolean x = false;
       for (int i = 0; i < array.length; i++) 
       { 
           if (b == array[i]) 
           { 
               x = true; 
               break; 
            } 
        } 
        return x; 
    } 
    public int index(int[] array, int x) 
    { 
        int index = 0;
        for (int i = 0; i < array.length; i++) 
        { 
            if (x == array[i]) 
            {  
                return index;
            } 
        } 
        return index;
    } 
    public void maxMin(int[] array) 
    { 
        int max = 0;
        int minimum = 0;
        int n = array.length; 
        int n1 = array.length - 1; 
        for (int i = 0; i < n - 1; i++) 
        { 
            int min = i;
            for (int v = i + 1; v < n; v++) 
            { 
                if (array[v] < array[min]) 
                { 
                    min = v;
                } 
                int temp = array[min];
                array[min] = array[i]; 
                array[i] = temp;
            } 
            max = array[n1];
            minimum = array[0];
            System.out.println(minimum);
            System.out.println(max); 
        }
    }
        public int secondLargest(int[] array) 
        { 
            int n = array.length; 
            int s = 0; 
            for (int i = 0; i < n - 1; i++) 
            { 
                int min = i; 
                for (int j = i + 1; j < n; j++) 
              { 
                  if (array[j] < array[min])
                  { 
                      min = j; 
                    }
                } 
                int temp = array[min]; 
                array[min] = array[i]; 
                array[i] = temp;
            }
            s= array[1]; 
            return s;
        }
        public int duplicate(int[] array){ 
            int d = 0; 
            for (int i = 0; i < array.length; i++){ 
                for (int j = i + 1; j < array.length; j++){ 
                    if (array[i] == (array[j])){ 
                        d = array[i];
                    } 
                } 
            } 
            return d;
    }
} 
       
