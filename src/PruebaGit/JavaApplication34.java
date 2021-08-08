/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebaGit;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class JavaApplication34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        
        int a=0;
        int b=0;
        int suma=0;
        
        System.out.println("Dame un numero: ");
        a = sc.nextInt();
        System.out.println("Dame un numero: ");
        b = sc.nextInt();
        
        suma=a+b;
        System.out.println("La suma es: "+suma);
        
        
        
    }
    
}
