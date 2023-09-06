package com.example.facebookcloneweekseven.Controller;

import com.example.facebookcloneweekseven.DTOs.PostDTO;
import com.example.facebookcloneweekseven.Model.Post;
import com.example.facebookcloneweekseven.Model.User;
import com.example.facebookcloneweekseven.Service.PostService;
import com.example.facebookcloneweekseven.Service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RestController
@RequestMapping("/api/Post")
@Slf4j
public class PostController {

//    @GetMapping("/")
    private PostService postService;
    private UserService userService;

    @Autowired
    public PostController(PostService postService, UserService userService){
        this.postService = postService;
        this.userService = userService;
    }

    @GetMapping("/viewPost")
    public ModelAndView viewPost(@PathVariable("id")int id){
        List<Post> postList = postService.findPostByUserId(id);
        return new ModelAndView("index").addObject("postList",postList);
    }
    @GetMapping("/savePost")
    public ModelAndView savePost(PostDTO postDTO) {
        User user = userService.findById(postDTO.getUser().getId());
        postDTO.setUser(user);
        postService.savePost(postDTO);
        List<Post> postList = postService.findPostByUserId(postDTO.getUser().getId());
        log.info("This is users post" + postList);
        return new ModelAndView("index").addObject("postList", postList);
    }
    }


