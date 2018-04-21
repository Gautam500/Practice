package Recursion_Example;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GAUTAM
 */
/*Send an integer to a function and count the digit 5 in an integer e.g 1523525, then result is 3*/
public class noOfOccurance {

    
    public static void main(String[] args) {
        
        System.out.println("Count of  5 is: "+count(452565455));
       }
    
    public static int count(int num)
    {
        if(num<=9)
        {
            if(num==5)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        else
        {
            if(num%10==5)
            {
                return 1+count(num/10);
            }
            else
            {
                return 0+ count(num/10);
            }
        }
    }
    
}
