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
public class removeSpace1 {

    
    public static void main(String[] args) {
        
        String input="   My  Name  is  Gautam    ";
        char[] input1 = input.toCharArray();
        char[] q=new char[20];
        int count=0;
        for(int i=0; i<input1.length-1; i++)
        {
            int j= input1[i];
            if(j==32)
            {
                continue;
            }
            else
            {
                 q[count]=input1[i];
                 count++;
            }
            
           
        }
         System.out.println(q);
    }
    
}
