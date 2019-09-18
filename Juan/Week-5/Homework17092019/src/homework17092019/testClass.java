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
public class testClass {
    public static void main(String[] args) {
        // TODO code application logic here
        int a [] = {12, -1, 3, 4, 1};
        Homework17092019 ex = new Homework17092019();
        ex.bubbleSort(a);
        int b =ex.myMethod(1, 2);
        System.out.println("\n"+"sum of 2 variables: "+b);
        int c =Homework17092019.substract(5, 1);
        System.out.println("\n"+"subtraction of 2 varibles: "+c);
    }
}
