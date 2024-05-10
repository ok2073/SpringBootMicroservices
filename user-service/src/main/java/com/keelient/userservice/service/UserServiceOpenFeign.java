package com.keelient.userservice.service;

import com.keelient.userservice.dto.ResponseDto;
import com.keelient.userservice.entity.User;

public interface UserServiceOpenFeign {
    User saveUser(User user);

    ResponseDto getUserOF(Long userId);
}
