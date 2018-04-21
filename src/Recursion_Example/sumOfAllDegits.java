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
/* Send an integer to a fuction and return the sum of all degits of that number e.g 123
 then result is 1+2+3=6 so [321%10 is 1], while divide (/) by 10 removes the rightmost
digit(321/10is 32) */
public class sumOfAllDegits {

    
    public static void main(String[] args) {
        
        System.out.println("Sum of Digits "+sum(1234));
        
    }
    public static int sum(int num)
    {
        if(num<=9)
        {
            return num;
        }
        else
        {
            return num%10+sum(num/10);
        }
    }
    
}
