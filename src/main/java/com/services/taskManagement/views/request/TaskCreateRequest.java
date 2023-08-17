package com.services.taskManagement.views.request;

import jakarta.validation.constraints.NotBlank;

public record TaskCreateRequest(
        //@NotBlank
        String title,
        String description
) {
}
