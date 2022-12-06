/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fizzbuzz;

/**
 *
 * @author fatmaal-wasmi
 */
public class FizzBuzz 
{
     
            

    public static void main(String[] args) 
    {
        fizzBuzz(100);
    }

    public static void fizzBuzz(int N)
    {
        
        for (int i = 1; i <= N; i++)
        { 
            
            System.out.println(((i%5 == 0) && (i%3 == 0)) ? "FizzBuzz" : (i%3 == 0) ? "Fizz" : (i%5 == 0) ? "Buzz":i);
        }
    }
}