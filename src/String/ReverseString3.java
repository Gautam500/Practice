/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *
 * @author GAUTAM
 */
public class ReverseString3 {
    public static void main(String args[])
    {
        String input="Gautam Shandilya";
        char[] input1 = input.toCharArray();
         
        
        for(int i = input1.length-1; i >= 0; i--)
        {  
            System.out.print(input1[i]);
        }
            System.out.print(input.length());
    }
    
}
