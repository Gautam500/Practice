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
public class fibanocci {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No");
        int number = sc.nextInt();
        int n1=0, n2=1,n3;
        System.out.println(n1);
        System.out.println(n2);
        for(int i=0;i<number;i++)
        {
            n3=n1+n2;
            System.out.println(""+n3);
            n1=n2;
            n2=n3;
        }
        
       
        
    }
    
}
