package com.services.taskManagement.service;

import com.services.taskManagement.common.Helpers;
import com.services.taskManagement.common.MapperUtils;
import com.services.taskManagement.models.Task;
import com.services.taskManagement.repository.TaskRepository;
import com.services.taskManagement.repository.UserRepository;
import com.services.taskManagement.views.request.TaskCreateRequest;
import com.services.taskManagement.views.response.TaskInfo;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private TaskRepository taskRepository;

    private UserRepository userRepository;

    private Helpers helpers;

    public TaskService(TaskRepository taskRepository, UserRepository userRepository, Helpers helpers) {
        this.taskRepository = taskRepository;
        this.userRepository = userRepository;
        this.helpers = helpers;
    }

    public TaskInfo createTask(TaskCreateRequest request) {
        if (!userRepository.existsById(request.userId())) {
            throw new IllegalArgumentException("Invalid user id");
        }
        Task task = helpers.mapRequestToModel(request);
        taskRepository.save(task);
        return helpers.mapModelToResponse(task);
    }
}
