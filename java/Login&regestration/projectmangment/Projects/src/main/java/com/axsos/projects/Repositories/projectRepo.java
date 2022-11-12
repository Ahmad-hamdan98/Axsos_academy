package com.axsos.projects.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.projects.Models.Projects;
import com.axsos.projects.Models.User;

//public interface projectRepo extends CrudRepository<Projects, Long>{

	




	@Repository
	public interface projectRepo extends CrudRepository<Projects, Long>{
		List<Projects> findAll();

		List<Projects> findAllByUserId(Long id);
		List<Projects> findAllprojectsByUser(User user);
		List<Projects> findByUserNotContains(User user);

	    @Query(value="SELECT projects.title,projects.due_date ,users.user_name FROM project.project_users join users on project_users.user_id = users.id join projects on project_users.project_id = projects.id where users.id= ?1", nativeQuery = true)
	    List<Object[]> joinPojectsAndUsers(Long id);

	    @Query(value="SELECT * FROM project.project_users join users on project_users.user_id = users.id join projects on project_users.project_id = projects.id where  project_users.user_id = ?1", nativeQuery = true)
	    List<Projects> joinPojectsAndUsers2(User user);


	    List<Projects> findByusersNotContains(User user);

	}