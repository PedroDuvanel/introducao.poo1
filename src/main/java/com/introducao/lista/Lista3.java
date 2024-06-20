package com.introducao.lista;

import java.util.Scanner;

public class Lista3 {

    public void ex01(){

        Scanner scanner = new Scanner(System.in);

        int escolha;

        System.out.println("Escolha um número entre 1 e 59: ");
        escolha = scanner.nextInt();

        while (( escolha > 59) && (escolha < 1)){  

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

    public void ex02(){

        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.println("Escolha um numero para ser dividido: ");
        num = scanner.nextInt();

        System.out.print("\033[H\033[2J"); 
        System.out.flush();

        for( int i = 1; i <= 10; i++){

            System.out.println(num + "x" + (i) + "=" + num * (i) );

        }

        scanner.close();


    }
}
