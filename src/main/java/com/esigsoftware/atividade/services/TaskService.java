package com.esigsoftware.atividade.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.esigsoftware.atividade.entities.Task;
import com.esigsoftware.atividade.repositories.TaskRepository;
import com.esigsoftware.atividade.services.exceptions.DatabaseException;
import com.esigsoftware.atividade.services.exceptions.ResourceNotFoundException;

@Service
public class TaskService {

	@Autowired
	private TaskRepository repository;
	
	public List<Task> findAll(){
		return repository.findAll();
	}
	
	public Task findById(Long id) {
		Optional<Task> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id)); // Tenta dar o get, caso não consiga,
	}                                                                    // lança uma exceção
	
	// Salvando pedido no banco de dados
	public Task insert(Task obj) {
		return repository.save(obj);
	}
	
	// Deletando pedido no banco de dados
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	// Atualizando pedido no banco de dados
	public Task update(Long id, Task obj) {
		try {
			Task entity = repository.getOne(id);
			updateData(entity, obj);
			return repository.save(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}	
	}

	private void updateData(Task entity, Task obj) {
		entity.setTitulo(obj.getTitulo());
		entity.setDescricao(obj.getDescricao());
		entity.setResponsavel(obj.getResponsavel());
		entity.setPrioridade(obj.getPrioridade());
		entity.setData(obj.getData());
	}
}
