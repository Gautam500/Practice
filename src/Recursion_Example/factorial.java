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
public class factorial {

    
    public static void main(String[] args) {
        
        System.out.println("Factorial is "+factorials(5));
    }
    public static int factorials(int num)
    {
        if(num==0 || num==1)
        {
            return 1;
        }
        else
        {
            return num*factorials(num-1);
        }
    }
    
}
