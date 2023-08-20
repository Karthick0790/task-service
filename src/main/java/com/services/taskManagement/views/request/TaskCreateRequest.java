package com.services.taskManagement.views.request;

import jakarta.validation.constraints.NotBlank;

public record TaskCreateRequest(
        String title,
        String description,
        Integer userId
) {
}
