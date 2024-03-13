package com.example.todo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todo.dao.TodoDao;
import com.example.todo.entities.Todo;

@Service
public class TodoServiceImplementaion implements TodoService  {
@Autowired
private TodoDao todoDao;
	
//	ArrayList<Courses> list =new ArrayList<>();
	TodoServiceImplementaion(){
//		list.add(new Courses(1,"Java",2000));
//		list.add(new Courses(2,"Python",5000));
	}
	
	
	@Override
	public List<Todo> getAllTodos() {
		
		return todoDao.findAll();
	}


	@Override
	public Todo getTodo(int id) {
//		 Courses c=null;
//		for(Courses course: list) {
//			if(course.getCourseId()==courseId) {
//				 c= course;
//				 break;
//			}
//		}
		return todoDao.getOne(id);
	}


	@Override
	public Todo addTodo(Todo todo) {
//		list.add(course);
		todoDao.save(todo);
		return todo;
	}


	@Override
	public void deleteCourse(int id) {
//		Courses d=null;
//		try {
//		for(Courses course: list) {
//			if(course.getCourseId()==courseId) {
//				list.remove(course);
//				System.out.println("Success");
//				 break;
//				
//			}
//			
//		}
//		}
//		catch(Exception e){
//			System.out.println(e);
//		}
//		
		
		Todo entity=todoDao.getOne(id);
		todoDao.delete(entity);
	}


	@Override
	public void updateTodo(int id, Todo todo) {
		

//		todoDao.save(todo);
//		todoDao.saveById(courseId,course);
		todoDao.updateById(id,todo.gettitle(),todo.getnote());
//		return todo;
	}
	
	
	
}
