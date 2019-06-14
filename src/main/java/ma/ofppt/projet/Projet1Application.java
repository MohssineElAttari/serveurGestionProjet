package ma.ofppt.projet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ma.ofppt.projet.entity.Etudiant;
import ma.ofppt.projet.service.EtudiantService;
import ma.ofppt.projet.service.GroupeService;

@SpringBootApplication
public class Projet1Application implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(Projet1Application.class, args);
	}

	@Autowired
	private EtudiantService es;

	@Autowired
	private GroupeService gs;
	@Override
	public void run(String... args) throws Exception {
	}

}
