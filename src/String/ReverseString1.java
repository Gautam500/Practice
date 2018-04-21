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
public class ReverseString1 {
    
    /* In this program we use  converting input string into byte by using getBytes*/
    public static void main(String[] args)
    {
        String input = "Gautam Shandilya";
        
        byte[] strAsByteArray = input.getBytes();
        byte[] result = new byte [strAsByteArray.length];
        for (int i = 0; i<strAsByteArray.length; i++)
            result[i] = 
             strAsByteArray[strAsByteArray.length-i-1];
 
        System.out.println(new String(result));
    }
}