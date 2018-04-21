/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion_Example;

/**
 *
 * @author GAUTAM
 */


/* Print No without using lopps*/


public class printNumber {

    
    public static void main(String[] args) {
       pnumber(10);
    }
    public static void pnumber(int num)
    {
        if(num==0)
        {
            return;
        }else
        {
            System.out.println(num);
            pnumber(num-1);
        }
    }
    
}
