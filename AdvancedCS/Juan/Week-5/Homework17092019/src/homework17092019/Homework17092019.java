/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework17092019;

/**
 *
 * @author justaguy
 */
public class Homework17092019 {

    private final String helloWorld = "Hello World";
    
    public int getElement2(int[] a)
    {
        return a[1];
    }
    
    public void bubbleSort(int[] a)
    {
       int hold;
       for(int i =0; i<a.length;i++)
       {
           for(int j=i; j>0;j--)
           {
               if(a[j] < a[j-1])
               {
                   hold = a[j];
                   a[j]=a[j-1];
                   a[j-1]=hold;
               }
               else
               break;
           }
       }
       for(int k = 0;k<a.length; k++)
       {
           System.out.println(a[k]);
       }
       
       
       
       }
    public int myMethod(int a) {
        return a;
    }
    
    public int myMethod(int a,int b) {
        
        return a+b;
    }
    
    public static int substract(int a, int b)
    {
        return a-b;
    }
}
