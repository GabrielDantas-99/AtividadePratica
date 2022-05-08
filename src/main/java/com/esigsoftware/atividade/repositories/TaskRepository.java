package com.esigsoftware.atividade.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esigsoftware.atividade.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

}
