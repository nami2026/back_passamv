package com.passamv.controller;

import com.passamv.dto.UserDto;
import com.passamv.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "https://passamv.netlify.app", allowCredentials = "true")
@RestController
@RequestMapping("api/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{email}")
    public UserDto getUser(@PathVariable("email") String email){
        return userService.getUser(email);
    }

}
