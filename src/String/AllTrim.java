/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *
 * @author GAUTAM
 */
public class AllTrim {

      
    static int i,j,k=0;
    
    public static void main(String[] args) {

        alltrim("    My name is Gautam     ");
        
    }
    
    static void alltrim(String s)
    {
        for(i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            break;
        }
        for(j=s.length()-1;j>=0;j--)
        {
            char ch=s.charAt(j);
            if(ch!=' ')
            break;
        }
        for(k=i;k<j+1;k++)
        System.out.print(s.charAt(k));
    }
    
}


    
