package com.passamv.service;

import com.passamv.dto.UserDto;
import com.passamv.entity.User;
import com.passamv.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserDto getUser(String email) {
        User user = userRepository.findByEmail(email).orElseThrow();
        return new UserDto(user.getEmail(), user.getId());
    }

}
