package com.services.taskManagement.converters;

import com.services.taskManagement.models.Task;
import com.services.taskManagement.views.request.TaskCreateRequest;
import com.services.taskManagement.views.response.TaskInfo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TaskMapper {
    TaskInfo mapModelToResponse(Task task);
    Task mapRequestToModel(TaskCreateRequest request);
}
