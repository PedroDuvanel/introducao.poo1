package com.introducao.lista;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista4 {

    public void ex01() {

        double[] vendas = { 10.00, 13.40, 9.90, 80.99, 140.53, 30.66, 20.00, 25.00, 90.00, 80.20, 110.00, 150.00 };
        double valor = 0;

        System.out.println("--------Bem vindo ao supermarket--------");

        for (int i = 0; i < vendas.length; i++) {
            valor += vendas[i];
        }

        System.out.println("O valor total das vendas do dia é: R$" + String.format("%.2f", valor));

    }

    public void ex02() {

        double[] vendas = { 10.00, 13.40, 9.90, 80.99, 140.53, 30.66, 20.00, 25.00, 90.00, 80.20, 110.00, 150.00 };
        double menorValor = vendas[0];
        double maiorValor = vendas[0];

        System.out.println("--------Bem vindo ao supermarket--------");
        System.out.println("----------------------------------------");

        for (int i = 1; i < vendas.length; i++) {
            if (vendas[i] < menorValor) {
                menorValor = vendas[i];
            }
        }

        for (int i = 1; i < vendas.length; i++) {
            if (vendas[i] > maiorValor) {
                maiorValor = vendas[i];
            }
        }

        System.out.printf("O menor valor é: R$ %.2f\n", menorValor);
        System.out.printf("O maior valor é: R$ %.2f\n", maiorValor);

    }

    public void ex03() {

        double[] vendas = { 10.00, 13.40, 9.90, 80.99, 140.53, 30.66, 20.00, 25.00, 90.00, 80.20, 110.00, 150.00 };
        double valor = 0;

        System.out.println("--------Bem vindo ao supermarket--------");
        System.out.println("----------------------------------------");

        double media;

        for (int i = 0; i < vendas.length; i++) {

            valor += vendas[i];

        }

        media = valor / vendas.length;

        System.out.println("O ticket médio das vendas é: R$ " + String.format("%.2f", media));

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

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        int opcao;

        System.out.println("------Bem vindos ao supermarket!-------");

        do {
            System.out.println("-------------MENU-------------");
            System.out.println("Digite a opção desejada: ");
            System.out.println("1- Adicionar item à lista.");
            System.out.println("2- Exibir lista.");
            System.out.println("3- Remover um item.");
            System.out.println("4- Sair.");
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
                    System.out.println("------- Lista de Compras -------");
                    for (String listItem : lista) {
                        System.out.println("- " + listItem);
                    }
                    System.out.println("Qual item deseja remover?");
                    String itemRemover = scanner.nextLine();
                    if (lista.remove(itemRemover)) {

                        System.out.println("Item removido!");

                    } else {

                        System.out.println("Item não encontrado!");

                    }
                    break;
                case 4:
                    System.out.println("Saindo do Supermarket. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
                    break;
            }
        } while (opcao != 4);

        scanner.close();

    }

    public void ex0708() {

        Scanner sc = new Scanner(System.in);
        String[] listaCompras = new String[10];
        double[] precos = new double[10];
        int indice = 0;

        while (true) {
            int opcao;
            int numRemover;
            double tempPreco;
            String tempItem;
            String item;

            System.out.println("\nMenu:");
            System.out.println("1 - Inserir item");
            System.out.println("2 - Ver lista de compras");
            System.out.println("3 - Remover item");
            System.out.println("4 - Ordenar por preço crescente");
            System.out.println("5 - Ordenar por preço decrescente");
            System.out.println("6 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o item a ser inserido: ");
                    item = sc.nextLine();

                    listaCompras[indice] = item;
                    System.out.println("Digite o preço do item: ");
                    precos[indice] = sc.nextDouble();

                    indice++;
                    break;

                case 2:
                    System.out.println("\nLista de Compras:");
                    for (int i = 0; i < indice; i++) {
                        System.out.println((i + 1) + " - " + listaCompras[i] + " - R$" + precos[i]);
                    }
                    break;

                case 3:
                    System.out.println("\nDigite o número do item a ser removido: ");
                    numRemover = sc.nextInt();

                    if (numRemover > 0 && numRemover <= indice) {
                        for (int i = numRemover - 1; i < indice - 1; i++) {
                            listaCompras[i] = listaCompras[i + 1];
                            precos[i] = precos[i + 1];
                        }
                        indice--;
                        System.out.println("Item removido com sucesso.");
                    } else {
                        System.out.println("Número de item inválido.");
                    }
                    break;

                case 4:
                    for (int i = 0; i < indice - 1; i++) {
                        for (int j = 0; j < indice - i - 1; j++) {
                            if (precos[j] > precos[j + 1]) {

                                tempPreco = precos[j];
                                precos[j] = precos[j + 1];
                                precos[j + 1] = tempPreco;

                                tempItem = listaCompras[j];
                                listaCompras[j] = listaCompras[j + 1];
                                listaCompras[j + 1] = tempItem;
                            }
                        }
                    }

                    System.out.println("\nLista de Compras ordenada por preço crescente:");
                    for (int i = 0; i < indice; i++) {
                        System.out.println((i + 1) + " - " + listaCompras[i] + " - R$" + precos[i]);
                    }
                    break;

                case 5:
                    for (int i = 0; i < indice - 1; i++) {
                        for (int j = 0; j < indice - i - 1; j++) {
                            if (precos[j] < precos[j + 1]) {

                                tempPreco = precos[j];
                                precos[j] = precos[j + 1];
                                precos[j + 1] = tempPreco;

                                tempItem = listaCompras[j];
                                listaCompras[j] = listaCompras[j + 1];
                                listaCompras[j + 1] = tempItem;
                            }
                        }
                    }

                    System.out.println("\nLista de Compras ordenada por preço decrescente:");
                    for (int i = 0; i < indice; i++) {
                        System.out.println((i + 1) + " - " + listaCompras[i] + " - R$" + precos[i]);
                    }
                    break;

                case 6:
                    System.out.println("Saindo...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

}
