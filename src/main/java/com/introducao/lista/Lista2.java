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

    public void ex03(){
        Scanner scanner = new Scanner(System.in);

        String resposta1;
        String resposta2 = "";
        String resposta3 = "";

        System.out.println("Olá, bem-vindo(a) ao banco!");

        System.out.println("Você possui mais de 65 anos? S/N");
        resposta1 = scanner.nextLine();

        if (resposta1.equalsIgnoreCase("S")) {
            System.out.println("Vá para a fila preferencial!");
        } else {
            System.out.println("Você possui alguma deficiência? S/N");
            resposta2 = scanner.nextLine();

            if (resposta2.equalsIgnoreCase("S")) {
                System.out.println("Vá para a fila preferencial!");
            } else {
                System.out.println("Você é gestante? S/N");
                resposta3 = scanner.nextLine();

                if (resposta3.equalsIgnoreCase("S")) {
                    System.out.println("Vá para a fila preferencial!");
                } else {
                    System.out.println("Vá para a fila comum!");
                }
            }
        }

        scanner.close();
    }

    public void ex04(){

        Scanner scanner = new Scanner(System.in);

        int idade;

        System.out.println("Olá,Bem vindo(a) ao evento,Qual a sua idade?");
        idade = scanner.nextInt();

        if(idade > 18){

            System.out.println("Voce pode entrar!");

        } else if(idade == 16 || idade == 17){

            System.out.println("Apenas com responsável!");

        } else {

            System.out.println("Voce não pode entrar!");

        }

        scanner.close();

    }

    public void ex05(){

        Scanner scanner = new Scanner(System.in);

        String emailDigitado;
        String senhaDigitada;

        System.out.println("Olá usuario");
        System.out.println("--------------------------------");
        System.out.println("Digite seu email: ");
        emailDigitado = scanner.nextLine();

        System.out.println("Digite sua senha: ");
        senhaDigitada = scanner.nextLine();

        String email = "pedro@pedro";
        String senha = "1234";

        if(emailDigitado.equals(email) && senhaDigitada.equals(senha)) {

            System.out.println("Login efetuado!");

        } else {
            
            if (!emailDigitado.equals(email) && !senhaDigitada.equals(senha)) {

            System.out.println("email e senhas incorretos!");

            } else if (!emailDigitado.equals(email)){

                System.out.println("Email incorreto!");

            }else{

                System.out.println("senha incorreta!");
            }

            scanner.close();

            }  
        
        }

    public void ex06(){ 
        
        Scanner scanner = new Scanner(System.in);

        float nota1;
        float nota2;
        float media;
        float recuperacao = 0;
    
        System.out.println("Olá aluno!");
        System.out.println("---------------------------");
    
        System.out.println("Digite sua nota na primeira prova: ");
        nota1 = scanner.nextFloat();
    
        System.out.println("Digite sua nota na segunda prova: ");
        nota2 = scanner.nextFloat();

        media = (nota1 + nota2) /2;
    
        if(media >= 6 ){
    
            System.out.println(" Parabéns! voce está aprovado!");
    
        } else {
    
            System.out.printf("nota media: %.2f \n", media) ;
            System.out.println("Digite a nota de recuperação! ");
            recuperacao = scanner.nextFloat();
    
        } 
      
        if ((nota1 > nota2) && (recuperacao > nota2)){

            media = (nota1 + recuperacao) /2;

        }else if((nota2 > nota1) && (recuperacao > nota1)){
    
            media = (nota2 + recuperacao) /2;
    
        } 
    
        if (media >= 6){
    
        System.out.printf("Parabéns,voce está aprovado! media final de: %.2f \n", media);
    
    
        }else {
    
            System.out.printf("Voce está reprovado!, media final de: %.2f \n", media);
    
        }

        scanner.close();
    }
}
    

      