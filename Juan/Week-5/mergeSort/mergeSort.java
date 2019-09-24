/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

import java.util.Arrays;



/**
 *
 * @author justaguy
 */
public class MergeSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] array ={9,6,5,8,7,1};
        mergeSort ex = new mergeSort();
        int [] a = ex.mergeSort(array,0,array.length-1);
        for(int i = 0; i<array.length;i++)
        {
        System.out.println(a[i]);
        }
    }
    
}
