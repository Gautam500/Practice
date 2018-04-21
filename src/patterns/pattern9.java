/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

/**
 *
 * @author GAUTAM
 */
/*

*******
 *****
  ***
   *



*/
public class pattern9 {

    public static void main(String[] args) {
       
       
            int i,j,k,z=5,s=1;
        
        for(i=1;i<=5;i++)
        {
            for(j=1;j<s;j++)
            {
                 System.out.print(" ");
            }
            s++;
            for(k=1;k<=(2*(z-i)-1);k++)
            {
                 System.out.print("*");
            }
            
             System.out.print("\n");
        }
    
       }
    }
    

