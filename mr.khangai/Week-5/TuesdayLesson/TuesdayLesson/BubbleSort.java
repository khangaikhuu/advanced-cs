import java.util.Arrays;
/**
 * Write a description of class BubbleSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BubbleSort{ 
    public static void main(String args[]) { 
        bubbleSort(new int[] { 20, 12, 45, 19, 91, 55 }); 
        bubbleSort(new int[] { -1, 0, 1 }); 
        bubbleSort(new int[] { -3, -9, -2, -1 }); } 
        /* * This method sort the integer array using bubble sort algorithm */ 
        public static void bubbleSort(int[] numbers) 
        { 
            System.out.printf("Unsorted array in Java :%s %n", Arrays.toString(numbers)); 
            for (int i = 0; i < numbers.length; i++) { 
                for (int j = numbers.length -1; j > i; j--) { 
                    if (numbers[j] < numbers[j - 1]) { 
                        int temp = numbers[j]; 
                        numbers[j] = numbers[j-1]; 
                        numbers[j-1] = temp;
                        //swap(numbers, j, j-1); 
                    } 
                } 
            } 
                        
            System.out.printf("Sorted Array using Bubble sort algorithm :%s %n", Arrays.toString(numbers)); } 
                        /* * Utility method to swap two numbers in array */ 
                        
            public static void swap(int[] array, int from, int to){ 
                    int temp = array[from]; 
                    array[from] = array[to]; 
                    array[to] = temp; 
                } 
            }


