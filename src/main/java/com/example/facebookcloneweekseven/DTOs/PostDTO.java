package com.example.facebookcloneweekseven.DTOs;

import com.example.facebookcloneweekseven.Model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostDTO {
    private String contentBody;
    private List<CommentDTO> comments;
    private User user;
}
