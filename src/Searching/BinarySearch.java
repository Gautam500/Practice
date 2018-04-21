/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

/**
 *
 * @author GAUTAM
 */
public class BinarySearch {

    
    public static void findingValue(int arr[], int key,int start, int end)
    {
       end=arr.length;
       int mid=(start+end)/2;
       
       while(start<end)
       {
           
           if(arr[mid]<key)
           {
               start=mid+1;
           }
           else if(arr[mid]== key)
           {
              System.out.println("Element is found at index: " + mid);  
              break; 
           }
           else
           {
               end=mid-1;
           }
           mid=(start+end)/2;
       }
         if ( start > end ){  
      System.out.println("Element is not found!");  
   }  
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};  
        int key = 50;  
        int end=arr.length-1;  
        findingValue(arr,key,0,end);   
    }
    
}
