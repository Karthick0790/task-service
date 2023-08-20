package com.services.taskManagement.common;

import com.services.taskManagement.models.Task;
import com.services.taskManagement.models.User;
import com.services.taskManagement.views.request.TaskCreateRequest;
import com.services.taskManagement.views.request.UserCreateRequest;
import com.services.taskManagement.views.response.TaskInfo;
import com.services.taskManagement.views.response.UserInfo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapperUtils {
    TaskInfo mapModelToResponse(Task task);

    Task mapRequestToModel(TaskCreateRequest request);

    UserInfo mapModelToResponse(User user);

    User mapRequestToModel(UserCreateRequest request);
}
