package com.keelient.userservice.service;

import com.keelient.userservice.dto.ResponseDto;
import com.keelient.userservice.entity.User;

public interface UserServiceWebClient {
    User saveUser(User user);

    ResponseDto getUserWc(Long userId);
}
