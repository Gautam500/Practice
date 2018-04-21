package patterns;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GAUTAM
 */
/*

     *
    **
   ***
  ****
 *****

*/
public class pattern2 {

    
    public static void main(String[] args) {
        
        int i,j,k,z=1;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=z;k++)
            {
                System.out.print("*");
            }
            z++;
            System.out.println("");
        }
    }
    
}
