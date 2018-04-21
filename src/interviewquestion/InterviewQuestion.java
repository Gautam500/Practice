/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewquestion;

import java.util.Scanner;

/**
 *
 * @author GAUTAM
 */
public class InterviewQuestion {

    
    public static void main(String[] args) {
        int i,j;
        int a[]=new int[10];
        int b[]=new int[10];
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter The First Array");
        for(i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter The 2nd Array");
        for(j=0;j<10;j++)
        {
            b[j]=sc.nextInt();
        }
        System.out.println("Common Element in Both of the array is");
        for(i=0;i<10;i++)
        {
            for(j=0;j<10;j++)
            {
                if(a[i]==b[j])
                {
                    System.out.println(a[i]);
                }
               
            }
        }
    }
    
}
