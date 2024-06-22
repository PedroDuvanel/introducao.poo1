package com.introducao.lista;

import java.util.Scanner;

public class Lista4 {

    public void ex01(){

        Scanner scanner = new Scanner(System.in);

        int[] vendas = { 10, 13, 9, 80, 140, 30, 20, 25, 90, 80, 110, 150 };
        int valor = 0;

        System.out.println("--------Bem vindo ao supermarket--------");

        for (int i = 0; i < vendas.length; i++) {

            valor += vendas[i];

        }

        System.out.println("O numero de vendas totais do dia é: " + valor + "R$");

        scanner.close();

    }

    public void ex02(){

        Scanner scanner = new Scanner(System.in);

        int[] vendas = { 10, 13, 9, 80, 140, 30, 20, 25, 90, 80, 110, 150 };
        int menorValor = vendas[0];
        int maiorValor = vendas[0];

        System.out.println("--------Bem vindo ao supermarket--------");
        System.out.println("----------------------------------------");

        for(int i = 0; i < vendas.length; i++){

            if(vendas[i] < menorValor){

                menorValor = vendas[i];

            }

        }

        for (int i = 0; i < vendas.length; i++){

            if(vendas[i] > maiorValor){

                maiorValor = vendas[i];

            }

        }

        System.out.println("O menor valor é: " + menorValor + " R$ ");

        System.out.println("O maior valor é: " + maiorValor + " R$ ");

        scanner.close();


    } 

    public void ex03(){

        int[] vendas = { 10, 13, 9, 80, 140, 30, 20, 25, 90, 80, 110, 150 };
        int valor = 0;

        System.out.println("--------Bem vindo ao supermarket--------");
        System.out.println("----------------------------------------");

        int media;

        for (int i = 0; i < vendas.length; i ++){

            valor += vendas[i];

        }

        media = valor / vendas.length;

        System.out.println("O ticket médio das vendas é: " + media + " R$ ");

    }



}


