package com.example.demo.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void registerUser(UserDto userDto) {
        User user = new User(userDto.getEmail(), userDto.getPassword(), userDto.getFirstName(), userDto.getLastName());
        userRepository.save(user);
    }
}

