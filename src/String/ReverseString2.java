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
public class ReverseString2 {
    public static void main(String[] args)
    {
        String Input="Gautam Shandilya";
        StringBuilder input1=new StringBuilder();
        input1= input1.append(Input);
        input1=input1.reverse();
        for(int  i=0;i<input1.length();i++)
        {
            System.out.print(input1.charAt(i));
        }
    }
    
}
