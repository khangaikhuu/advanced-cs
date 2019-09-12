public class lesson4
{
    public void exercise1 ()
    {
        int[] myArray = {1, 2, 3, 4, 5};
        int sum = 0;
        for(int i = 0; i<myArray.length ; i++)
        {
            sum +=myArray[i];
        }
        int avg = sum/myArray.length;
        System.out.println( avg);
    }
    
    public boolean value(int[] myArray, int x) {
            boolean a = false;
            for (int i = 0; i < myArray.length; i++) {
                if (x == myArray[i]) {
                    a = true;
                    break;
                }
        }
        return a;
    }

    public int exercise3(int[] myArray, int x) {
        int exercise3 = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (x == myArray[i]){
                exercise3 = i;
                break;
            }
        }
        return exercise3;
    }
//exercise 3 is basically the same as exercise 2
    public void exerciseFour(int[] myArray) {
        int max = 0;
        int min = 0;
        int x = myArray.length;
        int y = myArray.length - 1;
        for (int i = 0; i < x - 1; i ++){
            int minn = i;
            for (int j = i + 1; j < x; j++){
                if (myArray[j] < myArray[minn]) {
                    minn = j;
                }
            }
            int temp = myArray[minn];
            myArray[minn] = myArray[i];
            myArray[i] = temp;
        }
        max = myArray[y];
        min = myArray[0];
        System.out.println("Maximum value is" +max);
        System.out.println("Minimum value is" +min);
    }
    
    public int exerciseFive(int[] array) {
        int n = array.length;
        int h = 0;
        for (int i = 0; i < n - 1; i ++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array [i] = temp;
        }
        h = array[1];
        return h;
    }         
}
