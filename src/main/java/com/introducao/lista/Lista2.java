package com.introducao.lista;

import java.util.Scanner;

public class Lista2 {

    public void ex01(){

        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Escreva um numero: ");
        numero = scanner.nextInt();

        if (numero %2 == 0) {
            
            System.out.println("o numero é par!");

        }

        else {

            System.out.println("O numero é impar!");

        }

        scanner.close();

    }

    public void ex02(){

        Scanner scanner = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Escreva um numero: ");
        numero1 = scanner.nextInt();

        System.out.println("Escreva outro numero para comparar: ");
        numero2 = scanner.nextInt();

        if(numero1 > numero2) {

            System.out.println("O numero " + " " + numero1 + " " + "é maior!");

        } else if(numero2 > numero1){

            System.out.println("O numero " + " " + numero2 + " " + "é maior!");   

        } else {
         
            System.out.println("os numeros são iguais!");

        }

        scanner.close();

    }
}
