package com.test2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Test2Application implements CommandLineRunner{

	@Autowired
	private JdbcTemplate template;
	
	public static void main(String[] args) {
		SpringApplication.run(Test2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		template.execute("DROP TABLE POKEMON IF EXISTS");
		template.execute("CREATE TABLE POKEMON(id INTEGER(3) PRIMARY KEY auto_increment,nombre VARCHAR (20))");
		
		for (int i = 0 ; i < 3 ; i++) {
			template.update("insert into pokemon(nombre)values('Pokemon 001"+i+"')");
			
		}
	}

}
