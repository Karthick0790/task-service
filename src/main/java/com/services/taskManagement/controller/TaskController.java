package com.services.taskManagement.controller;

import com.services.taskManagement.service.TaskService;
import com.services.taskManagement.views.request.TaskCreateRequest;
import com.services.taskManagement.views.response.TaskInfo;
import jakarta.validation.Valid;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/task", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class TaskController {

    private TaskService taskService;

    private Logger logger = LogManager.getLogger(TaskController.class);

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public TaskInfo createTask(@RequestBody TaskCreateRequest taskCreateRequest) {
        logger.info("Received request to create task");
        return taskService.createTask(taskCreateRequest);
    }
}
