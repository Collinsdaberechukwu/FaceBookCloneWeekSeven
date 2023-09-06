//package com.example.facebookcloneweekseven.Controller;
//
//import com.example.facebookcloneweekseven.DTOs.PostDTO;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;
//
//@RestController
//@RequestMapping("/api/User")
//@Slf4j
//public class UserController {
//
//    @GetMapping(" Profile")
//    public ModelAndView getUserProfile(){
//        log.info("userController Class = User Id");
//        return  new ModelAndView("index").addObject("post", new PostDTO());
//    }
//    @GetMapping("SignUp")
//    public ModelAndView SignUp(){
////        log.info("userController Class = User Id");
//        return  new ModelAndView("signUpForm").addObject("Sign Up successful");
//    }
//}
