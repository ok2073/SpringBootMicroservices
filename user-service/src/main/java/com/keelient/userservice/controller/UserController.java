package com.keelient.userservice.controller;

import com.keelient.userservice.dto.ResponseDto;
import com.keelient.userservice.entity.User;
import com.keelient.userservice.service.UserService;
import com.keelient.userservice.service.UserServiceOpenFeign;
import com.keelient.userservice.service.UserServiceWebClient;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")
@AllArgsConstructor
public class UserController {

    private UserService userService;
    private UserServiceWebClient userServiceWebClient;
    private UserServiceOpenFeign userServiceOpenFeign;

    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody User user){
        User savedUser = userService.saveUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto> getUser(@PathVariable("id") Long userId){
        //ResponseDto responseDto = userServiceOpenFeign.getUserOF(userId);
        ResponseDto responseDto = userService.getUser(userId);
        return ResponseEntity.ok(responseDto);
    }
}
