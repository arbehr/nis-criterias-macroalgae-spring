package com.arbehr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MacroalgaeSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MacroalgaeSpringApplication.class, args);
	}

	/*@Bean
	CommandLineRunner initDatabase(MacroalgaeRepository macroalgaeRepository) {
		return args -> {
			macroalgaeRepository.deleteAll();
			Macroalgae m = new Macroalgae();
			m.setSpecie("teste1");
			m.setConspicuousness("");
      		m.setCriteria_inv_other("");
			m.setCriteria_inv_spread("");
			m.setDistribution("");
			m.setEconomic_ecological_impact("");
			m.setOrigin("");
			m.setOrigin_typeLoc("1.1");
			m.setReports("");
			m.setStudies("");
			m.setVector("");
			m.setStatus("NIS");
			macroalgaeRepository.save(m);
		};
	}*/
}
