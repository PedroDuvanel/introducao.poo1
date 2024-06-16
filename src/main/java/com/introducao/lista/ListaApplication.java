package com.introducao.lista;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListaApplication.class, args);

		Lista1 lista = new Lista1();
		lista.ex01();

		Lista1 lista2 = new Lista1();
		lista2.ex02();

        Lista1 lista3 = new Lista1();
		lista3.ex03();

		Lista1 lista4 = new Lista1();
		lista4.ex04();

		

	}


}
