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
* *
*   *
* * * *

*/
public class pattern6 {

   
    public static void main(String[] args) {
        int n=5;
        System.out.print("*\n");
        for(int i=1; i<=n; i++)
        {
            System.out.print("*");
            for(int j=1; j<i; j++)
            {
                System.out.print(" ");
            }
            System.out.print("*\n");
        }
        for(int j=1; j<=n; j++)
        {
            System.out.print("* ");
        }
    }
    
}
