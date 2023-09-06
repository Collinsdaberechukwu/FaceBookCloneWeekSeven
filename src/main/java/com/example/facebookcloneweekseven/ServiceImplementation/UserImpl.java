package com.example.facebookcloneweekseven.ServiceImplementation;

import com.example.facebookcloneweekseven.DTOs.SignUpDTO;
import com.example.facebookcloneweekseven.Model.User;
import com.example.facebookcloneweekseven.Repository.UserRepository;
import com.example.facebookcloneweekseven.Service.UserService;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserImpl implements UserService {
    private UserRepository userRepository;
    @Autowired
    public UserImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Override
    public User add(SignUpDTO signUpDTO){
        signUpDTO.setPassword(BCrypt.hashpw(signUpDTO.getPassword(),BCrypt.gensalt()));
        return userRepository.save(new User(signUpDTO));
    }
    @Override
    public User findById(int id){
        return userRepository.findById("id").orElseThrow(()-> new NullPointerException("User cant be fetched from the id" + id));
    }
  @Override
    public  User findByEmail(String email){
        return userRepository.findByEmail(email);
    }
}
