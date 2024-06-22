package com.introducao.lista;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.w3c.dom.ls.LSException;

@SpringBootApplication
public class ListaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListaApplication.class, args);

		limpa_windows();

		Lista4 lista04 = new Lista4();
		lista04.ex04();

		finaliza();


	} 

	static void limpa_windows() {
		try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.println("Este comando só funciona no Windows.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

	static void finaliza() {
		System.out.println("\n\n\n\n");
	}

}
