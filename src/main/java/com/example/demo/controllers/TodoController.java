package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.entities.Todo;
import com.example.demo.models.repositories.TodoRepository;

@RestController
@RequestMapping("api/todos")
public class TodoController {

	@Autowired
	private TodoRepository todoRepository;
	
	@GetMapping()
	public List<Todo> index() {
		return todoRepository.findAll();
	}
	
}
