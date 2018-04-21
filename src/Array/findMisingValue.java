/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/**
 *
 * @author GAUTAM
 */
public class findMisingValue {

    
    public static void main(String[] args) {
        
        int a[] = {1,2,4,5,6};
        int miss = missingvalue(a,5);
        System.out.println(miss);   
        
       
    }
    static int missingvalue(int a[], int n)
    {
        
        int total=(n+1)*(n+2)/2;
        for(int i=0; i<n; i++)
        {
            total -= a[i];
        }
        return total;
    }
    
}
