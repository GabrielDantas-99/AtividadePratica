package com.esigsoftware.atividade.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esigsoftware.atividade.entities.Task;
import com.esigsoftware.atividade.repositories.TaskRepository;

@Service
public class TaskService {

	@Autowired
	private TaskRepository repository;
	
	public List<Task> findAll(){
		return repository.findAll();
	}
	
	public Task findById(Long id) {
		Optional<Task> obj = repository.findById(id);
		return obj.get();
	}
	
	// Salvando pedido no banco de dados
	public Task insert(Task obj) {
		return repository.save(obj);
	}
}
