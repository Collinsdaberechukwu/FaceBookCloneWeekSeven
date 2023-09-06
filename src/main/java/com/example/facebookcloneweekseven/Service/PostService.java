package com.example.facebookcloneweekseven.Service;

import com.example.facebookcloneweekseven.DTOs.PostDTO;
import com.example.facebookcloneweekseven.Model.Post;

import java.util.List;

public interface PostService {
    Post savePost(PostDTO postDTO);
    List<Post> findPostByUserId(int id);
}
