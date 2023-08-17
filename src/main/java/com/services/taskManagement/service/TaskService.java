package com.services.taskManagement.service;

import com.services.taskManagement.converters.TaskMapper;
import com.services.taskManagement.models.Task;
import com.services.taskManagement.repository.TaskRepository;
import com.services.taskManagement.views.request.TaskCreateRequest;
import com.services.taskManagement.views.response.TaskInfo;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private TaskRepository taskRepository;

    private TaskMapper taskMapper;

    public TaskService(TaskRepository taskRepository, TaskMapper taskMapper) {
        this.taskRepository = taskRepository;
        this.taskMapper = taskMapper;
    }

    public TaskInfo createTask(TaskCreateRequest request) {
        Task task = taskMapper.mapRequestToModel(request);
        taskRepository.save(task);
        return taskMapper.mapModelToResponse(task);
    }
}
