package com.example.facebookcloneweekseven.Service;

import com.example.facebookcloneweekseven.DTOs.SignUpDTO;
import com.example.facebookcloneweekseven.DTOs.UserDTO;
import com.example.facebookcloneweekseven.Model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User add(SignUpDTO signUpDTO);
    User findById(int id);
    User findByEmail(String email);
}
