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
public class removeSpace {

    
    public static void main(String[] args) {
        
        String input="   My  Name  is  Gautam    ";
        char[] input1 = input.toCharArray();
        for(int i=0; i<input1.length-1; i++)
        {
            if((input1[i] != ' ')&& (input1[i] != '\t'))
            {
                System.out.print(input1[i]);
            }
           
        }
    }
    
}
