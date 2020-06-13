/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Arrays;

/**
 *
 * @author GCA
 */
public class Array1 {
    
    public static void main(String args[])
    {
        int arr[] =  {1,4,9};
       
        repeatMethod(arr);
    }
    
    public static void repeatMethod(int arr[])
    {
        int newArray[] = new int[arr.length*3];
              

        int j = 0 ; 
        for(int i = 0 ; i<newArray.length;i++)
        {
          
           newArray[i] = arr[j];
            
           if((j>=arr.length-1))
           {
               j = 0 ;
               
           }
            else
           {
                 j++;  
           }
           
          
           
          
          
        }
        
          System.out.println(Arrays.toString(newArray));
    }
 
}
