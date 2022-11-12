package com.axsos.projects.Repositories;



import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.projects.Models.Task;



@Repository
public interface TaskRepo extends CrudRepository<Task, Long>{
	List<Task> findAll();
}