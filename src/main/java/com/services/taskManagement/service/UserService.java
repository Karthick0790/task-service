package com.services.taskManagement.service;

import com.services.taskManagement.common.Helpers;
import com.services.taskManagement.models.User;
import com.services.taskManagement.repository.UserRepository;
import com.services.taskManagement.views.request.UserCreateRequest;
import com.services.taskManagement.views.response.UserInfo;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    private Helpers helpers;

    public UserService(UserRepository userRepository, Helpers helpers) {
        this.userRepository = userRepository;
        this.helpers = helpers;
    }

    public UserInfo createUser(UserCreateRequest userCreateRequest) {
        User user = helpers.mapRequestToModel(userCreateRequest);
        userRepository.save(user);
        return helpers.mapModelToResponse(user);
    }
}
