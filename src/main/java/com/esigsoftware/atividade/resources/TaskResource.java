package com.esigsoftware.atividade.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esigsoftware.atividade.entities.Task;

@RestController
@RequestMapping(value = "/tasks")
public class TaskResource {

	@GetMapping
	public ResponseEntity<Task> findAll() {
		Task t = new Task(1L, "Criar", "Criar Interface", "Gabriel", "Alta", "22/05/2022");
		return ResponseEntity.ok().body(t);
	}
}
