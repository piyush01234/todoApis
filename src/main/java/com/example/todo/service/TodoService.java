package com.example.todo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.todo.entities.Todo;

public interface TodoService {

	public List<Todo> getAllTodos();

	public Todo getTodo(int courseId);

	public Todo addTodo(Todo course);

	public void deleteCourse(int courseId);

	public void updateTodo(int courseId, Todo course);

	
}
