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
public class fibanocci_Series {

    
    public static void main(String[] args) {
        
        System.out.println("Fibanocci Series: "+fabinocci(6));
    }
    public static int fabinocci(int num)
    {
        if(num==0)
        {
            return 0;
        }
        if(num==1)
        {
          return 1;  
        }
        else
        {
            return fabinocci(num-1)+fabinocci(num-2);
            
        }
       
    }
    
}
