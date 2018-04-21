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

/* We have mobile phones numbered 1,2,3.... Even number of mobiles have two speakers and odd number of 
mobile have 1 speaker. Send the number of mobile to a function and return the total number of speakers
all mobile phone have*/
public class mobile_speakers {

    
    public static void main(String[] args) {
        System.out.println("Mobile Speakers: "+mobile(8));
        
    }
    
    public static int mobile(int num)
    {
        if(num==0)
        {
            return 0;
        }
        else
        {
            if(num%2==0)
            {
                return 2+mobile(num-1);
            }
            else
            {
                return 1+mobile(num-1);
            }
        }
    }
    
}
