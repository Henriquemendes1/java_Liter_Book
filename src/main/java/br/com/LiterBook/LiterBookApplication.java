package br.com.LiterBook;

import br.com.LiterBook.models.DadosLivro;
import br.com.LiterBook.service.ConsumoApi;
import br.com.LiterBook.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiterBookApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LiterBookApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://gutendex.com/books?search=hamlet");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosLivro dados = conversor.obterDados(json, DadosLivro.class);
		System.out.println(dados);
	}
}
