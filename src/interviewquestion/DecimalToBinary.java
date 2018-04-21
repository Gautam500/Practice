/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewquestion;

import java.util.Scanner;

/**
 *
 * @author GAUTAM
 */
public class DecimalToBinary {

    
    public static void main(String[] args) {
        
        int i=0;
        Scanner sc= new Scanner(System.in);
         System.out.print("Enter the decimal No: ");
         int[] arr = new int[20];
         int temp = sc.nextInt();
         
         if(temp==0)
         {
              System.out.print("Binary Value is 0");
         }
         else
         {
             while(temp>0)
             {
             arr[i]=temp%2;
             temp=temp/2;
             i++;
             }
             
         }
          System.out.print("Binary Value is: ");
         for(int j=i-1;j>=0;j--)
         {
              System.out.print(arr[j]);
         }
    }
    
}
