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
public class sequentialSearch {

    
    
    public static int linearSearch(int my_array[],int key)
    {
        int n = my_array.length;
         for(int i=0; i<n; i++)
       {
        if( my_array[i]== key)
        {
            return i;
        }
       
       }
         return -1;
    }
     
    public static void main(String[] args) {
       int[] arr1 = {1, 2, 5, 9, 6, 3, 7, 11};
       
       System.out.println("Enter the element want to searched");
       Scanner sc= new Scanner(System.in);
       int number = sc.nextInt();
       System.out.println("Key "+number+" found at index: "+linearSearch(arr1, number));
      
    }
    }
    

