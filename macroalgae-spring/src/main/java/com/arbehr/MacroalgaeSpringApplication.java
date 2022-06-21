package com.arbehr;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.arbehr.model.Macroalgae;
import com.arbehr.repository.MacroalgaeRepository;


@SpringBootApplication
public class MacroalgaeSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MacroalgaeSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(MacroalgaeRepository macroalgaeRepository) {
		return args -> {
			macroalgaeRepository.deleteAll();
			Macroalgae m = new Macroalgae();
			m.setSpecie("teste1");
			m.setConspicuousness("");
      		m.setCriteria_inv_other("");
			m.setCriteria_inv_spread("");
			m.setDistribution("");
			m.setImpact("");
			m.setOrigin("");
			m.setOrigin_typeLoc("1.1");
			m.setReports("");
			m.setStudies("");
			m.setVector("");
			m.setStatus("NIS");
			macroalgaeRepository.save(m);
		};
	}
}
