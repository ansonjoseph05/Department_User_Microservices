package com.employeemanagement.user.controller;

import com.employeemanagement.user.service.UserService;
import com.employeemanagement.user.VO.ResponseTemplateVO;
import com.employeemanagement.user.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUSer(@RequestBody User user){
        log.info("Inside saveUser of UserController");
        return userService.saveUSer(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
        log.info("Inside getUserWithDepartment of UserController");
        return userService.getUserWithDepartment(userId);
    }
}
