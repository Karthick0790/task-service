package com.services.taskManagement.common;

import com.services.taskManagement.models.Task;
import com.services.taskManagement.models.User;
import com.services.taskManagement.repository.UserRepository;
import com.services.taskManagement.views.request.TaskCreateRequest;
import com.services.taskManagement.views.request.UserCreateRequest;
import com.services.taskManagement.views.response.TaskInfo;
import com.services.taskManagement.views.response.UserInfo;
import org.springframework.stereotype.Component;

@Component
public class Helpers {

    private UserRepository userRepository;
    private MapperUtils mapper;

    public Helpers(UserRepository userRepository, MapperUtils mapper) {
        this.userRepository = userRepository;
        this.mapper = mapper;
    }

    public Task mapRequestToModel(TaskCreateRequest request) {
        Task task = mapper.mapRequestToModel(request);
        task.setUser(userRepository.findById(request.userId()).orElse(null));
        return task;
    }

    public TaskInfo mapModelToResponse (Task task) {
        return mapper.mapModelToResponse(task);
    }

    public UserInfo mapModelToResponse(User user) {
        return mapper.mapModelToResponse(user);
    }

    public User mapRequestToModel(UserCreateRequest request) {
        return mapper.mapRequestToModel(request);
    }
}
