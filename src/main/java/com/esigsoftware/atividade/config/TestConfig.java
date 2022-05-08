package com.esigsoftware.atividade.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.esigsoftware.atividade.entities.Task;
import com.esigsoftware.atividade.repositories.TaskRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private TaskRepository taskRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Task t1 = new Task(null, "Criar TestConfig", "Criar testconfig para...", "Gabriel", "Alta", Instant.parse("2022-04-29T20:52:04Z"));
		Task t2 = new Task(null, "Criar TaskRepository", "Criar TaskRepository para...","Felipe", "Média", Instant.parse("2022-04-29T20:52:04Z"));
		
		taskRepository.saveAll(Arrays.asList(t1, t2));
		
	}
	
	
	
}
