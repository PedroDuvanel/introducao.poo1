package com.introducao.lista;

import java.util.Scanner;

public class Lista4 {

    public void ex01() {

        Scanner scanner = new Scanner(System.in);

        int[] vendas = { 10, 13, 9, 80, 140 };
        int valor = 0;

        System.out.println("--------Bem vindo ao supermarket--------");

        for (int i = 0; i < vendas.length; i++) {

            valor += vendas[i];

        }

        System.out.println("O numero de vendas totais do dia é: " + valor);

        scanner.close();

    }



}
