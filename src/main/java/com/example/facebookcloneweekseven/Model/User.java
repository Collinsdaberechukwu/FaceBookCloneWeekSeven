package com.example.facebookcloneweekseven.Model;

import com.example.facebookcloneweekseven.DTOs.SignUpDTO;
import com.example.facebookcloneweekseven.DTOs.UserDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
@NoArgsConstructor
@Data
@Entity
@Table(name = "users_table")
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer Id;

    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String gender;


    public User(SignUpDTO signUpDTO){
        this.firstName = signUpDTO.getFirstName();
        this.lastName = signUpDTO.getLastName();
        this.gender = signUpDTO.getGender();
        this.email = signUpDTO.getEmail();
        this.password = signUpDTO.getPassword();
    }
}
