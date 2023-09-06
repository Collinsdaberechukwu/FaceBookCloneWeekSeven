package com.example.facebookcloneweekseven.Repository;

import com.example.facebookcloneweekseven.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    User findByEmail(String email);
}
