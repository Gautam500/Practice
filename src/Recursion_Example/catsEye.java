/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion_Example;

/**
 *
 * @author GAUTAM
 */
/* We have cats and each cat havetwo eyes. Send the number of cats to a function
and return the total number of eyes all cats have */
public class catsEye {

    
    public static void main(String[] args) {
        System.out.println("cats Eyes"+catEyes(7));
        
    }
    
    public static int catEyes(int cats)
    {
        if(cats==0)
        {
            return 0;
        }
        else
        {
            return 2 + catEyes(cats-1);
        }
    }
}
