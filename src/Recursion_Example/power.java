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
/* Find power by sending base and power value to a function */
public class power {

   
    public static void main(String[] args) {
         System.out.println("power: "+powers(3,3));
    }
    public static int powers(int base, int num)
    {
        if(num==1)
        {
            return base;
        }
        else
        {
        return base*powers(base,num-1);
        }
    }
}
