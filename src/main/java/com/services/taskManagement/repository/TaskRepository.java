package com.services.taskManagement.repository;

import com.services.taskManagement.models.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Integer> {
}
