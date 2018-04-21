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
public class reverseStringwithoutchar {

   
    public static void main(String[] args) {
       String st = "My Name is Chandan";
         String st1[]= st.split(" ");
         for(int i=st1.length-1;i>=0;i-- )
         {
             System.out.print(" "+st1[i]);
         }
    } 
    
}
