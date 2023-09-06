package com.example.facebookcloneweekseven.Model;

import com.example.facebookcloneweekseven.DTOs.PostDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
//@Slf4j
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Post {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String contentBody;
    @ManyToOne
    private User user;

    public Post(PostDTO postDTO){
       this.contentBody = postDTO.getContentBody();
       this.user = postDTO.getUser();

    }

}
