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
public class binary {

    
    public static void main(String[] args) {
        
        int[] array={11,34,56,77,88,99};
        System.out.println("Searched Element is : "+binarySearch(array, 99, 0, array.length-1));
    }
    public static int binarySearch(int [] array, int key, int start, int end)
    {
        if(start<=end)
        {
            int middle = (start+end)/2;
            if(array[middle]>key)
            {
                return binarySearch(array, key, start,middle-1);
            }
            else if (array[middle]<key)
            {
                return binarySearch(array, key, middle+1,end);
            }
            else
            {
                return middle;
            }
        }
        else
        {
            return-1;
        }
    }
    
}
