package com.example.demo.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.entities.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
