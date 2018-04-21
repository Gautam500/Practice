/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author GAUTAM
 */
public class FindDuplicateValue {

    
    public static void main(String[] args) {
        FindDuplicateValue dup = new FindDuplicateValue();
        dup.duplicate();
        
    }
    public void duplicate()
    {
        int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
        int n=my_array.length;
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if ((my_array[i] == my_array[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : "+my_array[j]);
                }
            }
        }
        
        
    }
    
}
