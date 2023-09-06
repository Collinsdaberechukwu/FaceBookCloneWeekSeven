package com.example.facebookcloneweekseven.Controller;

import com.example.facebookcloneweekseven.DTOs.LoginDTO;
import com.example.facebookcloneweekseven.DTOs.SignUpDTO;
import com.example.facebookcloneweekseven.Model.Post;
import com.example.facebookcloneweekseven.Model.User;
import com.example.facebookcloneweekseven.Service.UserService;
import jakarta.servlet.http.HttpSession;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


//@RequiredArgsConstructor
@AllArgsConstructor
@RestController
@RequestMapping("/api/user")
@Slf4j
public class LoginController {
    private UserService userService;

    @GetMapping("/")
    public ModelAndView signUp() {

return new ModelAndView("SignUp")
.addObject("signUpForm", new SignUpDTO());
    }
    @PostMapping("/sign-up")
    public ModelAndView signUp(SignUpDTO signUpDTO, BindingResult bindingResult) {
        User user = userService.add(signUpDTO);
      bindingResult.hasErrors();

      if (user != null) {

    return new ModelAndView("index").addObject("login", new LoginDTO())
            .addObject("userMessage", "Sign up successful, please login.");

        }

                return new ModelAndView("SignUp").addObject("signUpForm", new SignUpDTO());


    }

    @GetMapping("/login")

    public ModelAndView loginPage() {

     return new ModelAndView("index").addObject("login", new LoginDTO());
    }

    @PostMapping("/login")

    public ModelAndView login(LoginDTO loginDTO, HttpSession session) {


log.info("USER - EMAIL-&#45;&#45;&ndash;&gt; {" + loginDTO.getEmail() + " " + loginDTO.getPassword() + "}");

User user = userService.findByEmail(loginDTO.getEmail());


if (user == null) {

log.error("User not found for email: " + loginDTO.getEmail());

return new ModelAndView("index")
.addObject("login", loginDTO)
.addObject("errorMessage", "Invalid email or password");

        }
                Post post = new Post();
        session.setAttribute("users", user);
log.info("Creating post for user with email: " + user.getEmail());


 return new ModelAndView("Profile")
.addObject("dashboard", "Welcome, user with email: " + loginDTO.getEmail())
.addObject("post", post);

    }
}

