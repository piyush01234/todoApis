package com.example.todo.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.todo.entities.Todo;

public interface TodoDao extends JpaRepository<Todo,Integer > {

	@Modifying
	@Transactional
	@Query("update Todo t set t.title=:title, t.note=:note where t.id=:id")
	public void updateById(@Param("id") int id,@Param("title") String title,@Param("note")String note);
	
}
