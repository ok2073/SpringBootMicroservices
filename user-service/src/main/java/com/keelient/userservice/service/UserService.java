package com.keelient.userservice.service;

import com.keelient.userservice.dto.DepartmentDto;
import com.keelient.userservice.dto.ResponseDto;
import com.keelient.userservice.entity.User;

public interface UserService {
    User saveUser(User user);

    ResponseDto getUser(Long userId);
}
