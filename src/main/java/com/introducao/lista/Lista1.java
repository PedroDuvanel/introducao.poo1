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

    public void ex04() {

        Scanner scanner = new Scanner(System.in);

        int num1;
        int sucessor;
        int antecessor;

        System.out.println("Olá, usuário!");
        System.out.println("Digite um numero para descobrir seu sucessor e antecessor: ");
        num1 = scanner.nextInt();

        sucessor = num1 + 1;
        antecessor = num1 - 1;

        System.out.println("O sucessor de" + " " + num1 + " " + "é" + " " + sucessor);

        System.out.println("O antecessor de" + " " + num1 + " " + "é" + " " + antecessor);

        scanner.close();

    }

    public void ex05() {

        Scanner scanner = new Scanner(System.in);

        int comprimento;
        int largura;
        int area;
        int valorm2;

        System.out.println("Olá usuário!");
        System.out.println("Qual o comprimento do terreno? ");
        comprimento = scanner.nextInt();

        System.out.println("Qual a largura do terreno? ");
        largura = scanner.nextInt();

        area = comprimento * largura;

        System.out.println("Qual o valor do M2 na sua região? ");
        valorm2 = scanner.nextInt();

        int valorInteiro = area * valorm2;

        System.out.println("O valor do terreno será de aproximadamente: " + valorInteiro + "R$");

        scanner.close();

    }

    public void ex06() {

        Scanner scanner = new Scanner(System.in);

        int distanciaPercorrida;
        int custoCombustivel;
        final double VALOR_DO_COMBUSTIVEL = 5.25;

        System.out.println("Qual a distancia percorrida? ");
        distanciaPercorrida = scanner.nextInt();

        System.out.println("Qual o custo do combustivel? ");
        custoCombustivel = (int) scanner.nextDouble();

        double autonomia = distanciaPercorrida / (custoCombustivel / VALOR_DO_COMBUSTIVEL);



        System.out.println("A sua autonomia foi de " + autonomia + "km/h");

        scanner.close();

	}
    
    public void ex07() {

        Scanner scanner = new Scanner(System.in);

        int nota1;
        int nota2;
        int nota3;
        int nota4;
        int media;

        System.out.println("Olá usuário!");
        System.out.println("Insira uma nota! ");
        nota1 = scanner.nextInt();

        System.out.println("Insira uma segunda nota! ");
        nota2 = scanner.nextInt();

        System.out.println("Insira uma terceira nota! ");
        nota3 = scanner.nextInt();

        System.out.println("Insira uma quarta nota! ");
        nota4 = scanner.nextInt();

        media = nota1 + nota2 + nota3 + nota4 / 4;

        System.out.println("A média aritméca dessas quatro notas será: " + media);

        scanner.close();


    }

    public void ex08() {

        Scanner scanner = new Scanner(System.in);
        
        float fahrenheit;
        float resultado;

        System.out.println("Digite a temperatura em fahrenheit: ");
        fahrenheit = scanner.nextFloat();

        resultado = (fahrenheit - 32) * 5/9;

        System.out.println("O valor em graus celsius é de: " + resultado);

        scanner.close();

    }

}


