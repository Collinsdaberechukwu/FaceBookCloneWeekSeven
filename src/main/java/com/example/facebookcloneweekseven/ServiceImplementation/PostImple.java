//package com.example.facebookcloneweekseven.ServiceImplementation;
//
//import com.example.facebookcloneweekseven.Controller.PostController;
//import com.example.facebookcloneweekseven.DTOs.PostDTO;
//import com.example.facebookcloneweekseven.Model.Post;
//import com.example.facebookcloneweekseven.Repository.PostRepository;
//import com.example.facebookcloneweekseven.Service.PostService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class PostImple implements PostService {
//    private PostRepository postRepository;
//    @Autowired
//    public PostImple(PostRepository postRepository){
//        this.postRepository = postRepository;
//    }
//    @Override
//    public Post savePost(PostDTO postDTO){return postRepository.save(new Post(postDTO));
//    }
//    @Override
//    public List<Post> findPostByUserId (int id){
//        return postRepository.findAllById(id);
//    }
//}
