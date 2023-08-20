package com.services.taskManagement.repository;


import com.services.taskManagement.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
