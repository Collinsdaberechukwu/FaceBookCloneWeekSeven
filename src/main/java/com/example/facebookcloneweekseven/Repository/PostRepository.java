package com.example.facebookcloneweekseven.Repository;

import com.example.facebookcloneweekseven.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post,Integer> {
    List<Post> findAllById(int id);
}
