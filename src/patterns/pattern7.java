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

   *
  ***
 *****
*******
*/
public class pattern7 {

    
    public static void main(String[] args) {
    
        int i,j,k=0;
        int n=5;
        for(i=1; i<=n; i++)
        {
            for(j=1;j<=n-i;j++)
            {
                 System.out.print(" ");
            }
            while(k != (2*i-1))
            {
                System.out.print("*");
                k++;
            }
            k=0;
            System.out.print("\n");
        }
    }
    
}
