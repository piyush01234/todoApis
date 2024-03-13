package com.example.todo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.todo.entities.Todo;
import com.example.todo.service.TodoService;

@RestController
@CrossOrigin
public class MyController {
	@Autowired
	private TodoService todoService;
	
	@GetMapping("/home")
	public String home(){
		return "Hello";
	}
	@GetMapping("/todo")
	public  List<Todo> getAllTodos() {
		return this.todoService.getAllTodos();
	}
	@GetMapping("/todo/{id}")
	public Todo getTodo(@PathVariable String id) {
		return this.todoService.getTodo(Integer.parseInt(id));
	}
	@PostMapping("/todo")
	public Todo addTodo(@RequestBody Todo todo) {
		return this.todoService.addTodo(todo);
	}
	
	@PutMapping("/todo/{id}")
	public void updateCourses(@PathVariable("id") Integer todoId,@RequestBody Todo course) {
		 this.todoService.updateTodo(todoId,course);
	}

	@DeleteMapping("/todo/{id}")
	public ResponseEntity<HttpStatus> deleteTodo(@PathVariable("id") Integer todoId) {
		try {
			this.todoService.deleteCourse(todoId);
			return new ResponseEntity<>(HttpStatus.ACCEPTED);
		}
		catch(Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
}
