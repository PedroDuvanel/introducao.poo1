package com.introducao.lista;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista4 {

    public void ex01() {

        int[] vendas = { 10, 13, 9, 80, 140, 30, 20, 25, 90, 80, 110, 150 };
        int valor = 0;

        System.out.println("--------Bem vindo ao supermarket--------");

        for (int i = 0; i < vendas.length; i++) {

            valor += vendas[i];

        }

        System.out.println("O numero de vendas totais do dia é: " + valor + "R$");

    }

    public void ex02() {

        int[] vendas = { 10, 13, 9, 80, 140, 30, 20, 25, 90, 80, 110, 150 };
        int menorValor = vendas[0];
        int maiorValor = vendas[0];

        System.out.println("--------Bem vindo ao supermarket--------");
        System.out.println("----------------------------------------");

        for (int i = 0; i < vendas.length; i++) {

            if (vendas[i] < menorValor) {

                menorValor = vendas[i];

            }

        }

        for (int i = 0; i < vendas.length; i++) {

            if (vendas[i] > maiorValor) {

                maiorValor = vendas[i];

            }

        }

        System.out.println("O menor valor é: " + menorValor + " R$ ");

        System.out.println("O maior valor é: " + maiorValor + " R$ ");

    }

    public void ex03() {

        int[] vendas = { 10, 13, 9, 80, 140, 30, 20, 25, 90, 80, 110, 150 };
        int valor = 0;

        System.out.println("--------Bem vindo ao supermarket--------");
        System.out.println("----------------------------------------");

        int media;

        for (int i = 0; i < vendas.length; i++) {

            valor += vendas[i];

        }

        media = valor / vendas.length;

        System.out.println("O ticket médio das vendas é: " + media + " R$ ");

    }

    public void ex04() {

        int[] lista = { 3, 5, 6, 7, 8, 10, 22, 55, 110 };
        int par = 0;

        for (int i : lista) {

            if (i % 2 == 0) {

                par++;

            }

        }

        System.out.println("A quantidade de números pares é: " + par);

    }

    public void ex05() {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        int opcao;

        System.out.println("------Bem vindos ao supermarket!-------");

        do {
            System.out.println("-------------MENU-------------");
            System.out.println("Digite a opção desejada: ");
            System.out.println("1- Adicionar item à lista.");
            System.out.println("2- Exibir lista.");
            System.out.println("3- Sair.");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("Digite o item a ser adicionado à lista:");
                    String item = scanner.nextLine();
                    lista.add(item);
                    System.out.println("Item adicionado à lista.");
                    break;
                case 2:
                    System.out.println("------- Lista de Compras -------");
                    for (String listItem : lista) {
                        System.out.println("- " + listItem);
                    }
                    break;
                case 3:
                    System.out.println("Saindo do Supermarket. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
                    break;
            }
        } while (opcao != 3);

        scanner.close();
    }

    public void ex06() {

        

    }
}
