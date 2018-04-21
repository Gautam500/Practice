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
public class Reversestringwithoutorder {

    
    public static void main(String[] args) {
       
        String st = "My Name is Chandan";
         String st1[]= st.split(" ");
         for(int i=0; i < st1.length;i++ )
         {
             char[] ch=st1[i].toCharArray();
             for(int j=ch.length-1; j>=0;j--)
             {
                 System.out.print(ch[j]);
             }
         }
    }
    
}
