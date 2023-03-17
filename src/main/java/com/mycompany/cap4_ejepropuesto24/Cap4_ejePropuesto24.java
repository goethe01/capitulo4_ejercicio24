package com.mycompany.cap4_ejepropuesto24;
import java.util.Scanner;
public class Cap4_ejePropuesto24 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A,B,C;
        
        System.out.println("DAME EL PESO DE LA ESFERA A");
        A = entrada.nextInt();
        System.out.println("DAME EL PESO DE LA ESFERA B");
        B = entrada.nextInt();
        System.out.println("DAME EL PESO DE LA ESFERA C");
        C = entrada.nextInt();
        
        if(A>B && A>C){
            System.out.println("LA ESFERA DE MAYOR PESO ES: A");
        }else if(B>A && B>C){
            System.out.println("LA ESFERA DE MAYOR PESO ES: B");
        }else{
            System.out.println("LA ESFERA DE MAYOR PESO ES: C");
        }
    }
}
