package com.introducao.lista;

import java.util.Random;

import java.util.Scanner;

public class Lista3 {

    public void ex01() {

        Scanner scanner = new Scanner(System.in);

        int escolha;

        System.out.println("Escolha um número entre 1 e 59: ");
        escolha = scanner.nextInt();

        while ((escolha > 59) && (escolha < 1)) {

            System.out.println("Escolha um número entre 1 e 59: ");
            escolha = scanner.nextInt();

        }

        try {
            for (int i = escolha; i > 0; i--) {

                System.out.print("\033[H\033[2J");
                System.out.flush();

                System.out.println(i + " segundos restantes.");

                Thread.sleep(1000);
            }

            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Tempo esgotado!");
        }

        catch (InterruptedException e) {
            System.out.println("O cronômetro foi interrompido.");
        }

        scanner.close();

    }

    public void ex02() {

        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.println("Escolha um numero para ser dividido: ");
        num = scanner.nextInt();

        System.out.print("\033[H\033[2J");
        System.out.flush();

        for (int i = 1; i <= 10; i++) {

            System.out.println(num + "x" + (i) + "=" + num * (i));

        }

        scanner.close();

    }

    public void ex03() {

        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Escreva um numero: ");
        num1 = scanner.nextInt();

        System.out.println("Escreva outro numero que seja maior que o primeiro : ");
        num2 = scanner.nextInt();

        while (num2 <= num1) {
            System.out.println("O segundo número deve ser maior que o primeiro.");
            System.out.println("Escreva novamente o segundo número: ");
            num2 = scanner.nextInt();
        }

        System.out.println("Os numeros pares no intervalo de " + num1 + " e " + num2 + " são: ");

        for (int i = num1; i <= num2; i++) {

            if (i % 2 == 0) {

                System.out.println(i);

            }

        }

        scanner.close();

    }

    public void ex04() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int num1;
        int randomNumber = random.nextInt(101);

        System.out.println("------- JOGO DA ADIVINHAÇÃO -------");
        System.out.println("----------------------------------");

        System.out.println("Escolha um número de 1 a 100: ");
        num1 = scanner.nextInt();

        System.out.println("----------------------------------");
        System.out.println("Tente adivinhar o número!");

        while (num1 != randomNumber) {
            if (Math.abs(randomNumber - num1) <= 5) {
                System.out.println("Está quase lá!");
            } else if (Math.abs(randomNumber - num1) <= 15) {
                System.out.println("Está quente! Tente um número " + (num1 < randomNumber ? "maior." : "menor."));
            } else {
                System.out.println("Está frio! Tente um número " + (num1 < randomNumber ? "maior." : "menor."));
            }
            num1 = scanner.nextInt();
        }

        System.out.println("Parabéns! Você acertou o número " + randomNumber + "!");

        scanner.close();
    }

    public void ex05() {

        Scanner scanner = new Scanner(System.in);

        String loginCorreto = "pedro";
        String senhaCorreta = "1234";
        int tentativas = 3;
        String loginDigitado;
        String senhaDigitada;

        System.out.println("------- Bem vindo ao sistema! -------");

        while (tentativas > 0) {
            System.out.println("Digite seu login: ");
            loginDigitado = scanner.nextLine();

            System.out.println("Digite sua senha: ");
            senhaDigitada = scanner.nextLine();

            if (loginDigitado.equals(loginCorreto) && senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Login efetuado!");
                break; 
            } else {

                tentativas--; 

                if (tentativas > 0) {
                    if (!loginDigitado.equals(loginCorreto)) {
                        System.out.println("Login incorreto. Tentativas restantes: " + tentativas);
                    } else {
                        System.out.println("Senha incorreta. Tentativas restantes: " + tentativas);
                    }
                }

                if (tentativas == 0) {
                    System.out.println("Número máximo de tentativas atingido. Acesso negado!");
                }
            }
        }

        scanner.close();
    }

    

}