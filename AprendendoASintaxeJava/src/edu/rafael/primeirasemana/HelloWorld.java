package edu.rafael.primeirasemana;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello World, Bootcamp Java DIO");
        
        // final String BR = "Brasil"; // Final não permite a alteração da VAR depois de declarada
        final double PI = 3.14;
        System.out.println(PI);
        String nome = "Seu Nome";

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        nome = sc.nextLine();
        System.out.println("Seu nome é: " + nome);


        sc.close();

    }
}
