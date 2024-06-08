package br.com.LiterBook;

import br.com.LiterBook.principal.Main;
import br.com.LiterBook.repository.AuthorRepository;
import br.com.LiterBook.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiterBookApplication implements CommandLineRunner {
	@Autowired
	AuthorRepository autorRepository;
	@Autowired
	BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(LiterBookApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main main = new Main(autorRepository,bookRepository);
		main.principal();
	}
}
