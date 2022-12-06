/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.max_subarray;

/**
 *
 * @author fatmaal-wasmi
 */

public class Max_SubArray
{
 static void Max_SubArray(int[] array)
    {
    int max_check = array[0], max_curr = array[0];
        for(int i=1;i<array.length;i++) max_curr = Math.max(max_check = Math.max(array[i], max_check+array[i]),max_curr);
        System.out.println(max_curr);
    }  
    public static void main(String[] args)
    {
        Max_SubArray(new int[] {-3,1,-8,4,-1,2,1,-5,5});    //OUTPUT : 6
        Max_SubArray(new int[] {-2,-3,4,-1,-2,1,5,-3}) ;    //OUTPUT : 7
        Max_SubArray(new int[] {3,2});                      //OUTPUT : 5                  
        Max_SubArray(new int[] {3,-2});                     //OUTPUT : 3  
       Max_SubArray(new int[] {-3,-4,5,-1,2,-4,6,-1});     //OUTPUT : 8  
        Max_SubArray(new int[] {-2,3,-1,2});                //OUTPUT : 4  
    }
}