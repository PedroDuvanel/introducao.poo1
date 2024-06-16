package com.introducao.lista;

import java.util.Scanner;

public class Lista1 {

    public void ex01() {

        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int resultado;

        System.out.println("Digite um número: ");
        num1 = scanner.nextInt();

        System.out.println("Digite um número: ");
        num2 = scanner.nextInt();

        resultado = num1 + num2;

        System.out.println("Este é o resultado: " + resultado);

        scanner.close();

    }

    public void ex02() {

        Scanner scanner = new Scanner(System.in);
        String nome;
        String sobrenome;

        System.out.println("Olá, usuário!");
        System.out.println("Qual o seu nome? ");
        nome = scanner.nextLine();

        System.out.println("Qual o seu sobrenome? ");
        sobrenome = scanner.nextLine();

        System.out.println("Olá," + nome + " " + sobrenome + "!");
        
        scanner.close();
    }

    public void ex03() {

        Scanner scanner = new Scanner(System.in);

        double valor1;
        double resultado;

        System.out.println("Olá usuario!");
        System.out.println("Digite um valor para ser convertido em dolar: ");
        valor1 = scanner.nextDouble();

        resultado = valor1 / 5.25;

        System.out.println("O valor convertido será de: " + resultado + " $");

        scanner.close();

    }
}