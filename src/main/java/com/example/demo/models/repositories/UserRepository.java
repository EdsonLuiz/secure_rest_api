package com.example.demo.models.repositories;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, UUID> {

}
